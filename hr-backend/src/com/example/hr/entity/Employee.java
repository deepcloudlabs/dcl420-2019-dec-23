package com.example.hr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "employees")
@NamedQueries({
		@NamedQuery(name = "Employee.findByIdentity", query = "select e from Employee e where e.identityNo=:identity"),
        @NamedQuery(name = "Employee.findAll", query = "select e from Employee e") 
})
@XmlRootElement
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "identity", unique = true, nullable = false)
	private String identityNo;
	@Column(name = "full_name")
	private String fullname;
	@Column(name = "account_iban")
	private String iban;
	@Column(name = "birth")
	private int birthYear;
	@Column(name = "salary")
	private double salary;
	@Column(columnDefinition = "longblob")
	@Lob
	private byte[] photo;
	@Column(name = "is_fulltime")
	private boolean fulltime;
	@Column(name = "dept")
	@Enumerated(EnumType.STRING)
	private Department department;

	public Employee() {
	}

	public Employee(String identityNo, String fullname) {
		this.identityNo = identityNo;
		this.fullname = fullname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public boolean isFulltime() {
		return fulltime;
	}

	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", identityNo=" + identityNo + ", fullname=" + fullname + ", iban=" + iban
				+ ", birthYear=" + birthYear + ", salary=" + salary + ", fulltime=" + fulltime + ", department="
				+ department + "]";
	}

}
