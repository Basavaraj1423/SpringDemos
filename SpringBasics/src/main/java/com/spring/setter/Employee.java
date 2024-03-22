package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String empName;
	private int employeeId;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		super();
	}
	public Employee(String empName, int employeeId) {
		super();
		this.empName = empName;
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	@Value("Surya")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Value("10")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", employeeId=" + employeeId + ", address=" + address + "]";
	}

}
