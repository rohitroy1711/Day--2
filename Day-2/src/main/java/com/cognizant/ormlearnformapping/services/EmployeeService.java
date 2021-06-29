package com.cognizant.ormlearnformapping.services;

import java.util.List;

import com.cognizant.ormlearnformapping.model.Employee;

public interface EmployeeService {

	public Employee getById(int id);

	public void save(Employee employee);

	// day 2 session 2 handson 1
	public List<Employee> getAll();
	
	// day 2 session 2 handson 4
	public double getAverageSalary();
	
	// day 2 session 2 handson 4
	public double getAverageSalaryByDept(int id);
	
	// day 2 session 2 handson 5
	public List<Employee> getAllEmployeesNative();

}
