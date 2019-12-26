package com.example.hr.data;

import java.util.List;
import java.util.Objects;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.hr.data.exception.EmployeeNotFoundException;
import com.example.hr.data.exception.ErrorCode;
import com.example.hr.entity.Employee;

@Stateless
public class EmployeeRepository {
	@PersistenceContext(unitName = "hrPU")
	private EntityManager em;

	@Transactional
	public Employee addEmployee(Employee emp) {
		emp.setId(null);
		em.persist(emp);
		return emp;
	}

	@Transactional
	public Employee deleteEmployee(long id) {
		Employee managed = em.find(Employee.class, id);
		if (Objects.isNull(managed))
			throw new EmployeeNotFoundException("Cannot find the employee!", ErrorCode.EMPLOYEE_NOT_FOUND,
					"07d3cf86-ae5d-4fe4-a01c-d8e330ca314a");
		return managed;
	}

	@Transactional
	public Employee updateEmployee(Employee emp) {
		Long id = emp.getId();
		Employee managed = em.find(Employee.class, id);
		if (Objects.isNull(managed))
			throw new EmployeeNotFoundException("Cannot find the employee!", ErrorCode.EMPLOYEE_NOT_FOUND,
					"9773e6d7-3117-4936-9f35-683fdaaf44ec");
		if (Objects.nonNull(emp.getDepartment()))
			managed.setDepartment(emp.getDepartment());
		managed.setSalary(emp.getSalary());
		if (Objects.nonNull(emp.getPhoto()))
			managed.setPhoto(emp.getPhoto());
		return managed;
	}

	public Employee findById(long id) {
		Employee employee = em.find(Employee.class, id);
		if (Objects.isNull(employee))
			throw new EmployeeNotFoundException("Cannot find the employee!", ErrorCode.EMPLOYEE_NOT_FOUND,
					"6256bb7e-0ec1-4f3a-a0c4-50e96f735ce0");
		return employee;
	}

	public Employee findByIdentity(String identity) {
		Employee employee = em.createNamedQuery("Employee.findByIdentity", Employee.class)
				.setParameter("identity", identity).getSingleResult();
		if (Objects.isNull(employee))
			throw new EmployeeNotFoundException("Cannot find the employee!", ErrorCode.EMPLOYEE_NOT_FOUND,
					"b68ffac1-23de-4fe1-8895-87eb666c64c3");
		return employee;
	}

	public List<Employee> findAll(int page, int size) {
		return em.createNamedQuery("Employee.findAll", Employee.class).setFirstResult(page * size).setMaxResults(size)
				.getResultList();
	}
}
