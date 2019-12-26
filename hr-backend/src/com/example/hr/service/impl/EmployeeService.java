package com.example.hr.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.example.hr.data.EmployeeRepository;
import com.example.hr.entity.Employee;

@Stateless
public class EmployeeService {
	@Inject
	private EmployeeRepository employeeRepository;

	public Employee findEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	public Employee findEmployeeByIdentity(String identity) {
		return employeeRepository.findByIdentity(identity);
	}

	public Employee deleteEmployeeById(Long id) {
		return employeeRepository.deleteEmployee(id);
	}

	@Transactional
	public Employee addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}

	public List<Employee> findEmployees(Integer page, Integer size) {
		return employeeRepository.findAll(page, size);
	}

}
