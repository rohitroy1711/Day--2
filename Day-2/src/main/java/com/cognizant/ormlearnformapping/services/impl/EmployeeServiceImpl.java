package com.cognizant.ormlearnformapping.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearnformapping.model.Employee;
import com.cognizant.ormlearnformapping.repository.EmployeeRepository;
import com.cognizant.ormlearnformapping.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

	// handson 4
	@Transactional(readOnly = true)
	public Employee getById(int id) {

		LOGGER.info("GET by ID method in EmployeeService Start");

		Optional<Employee> emp = employeeRepository.findById(id);
		if (!emp.isPresent())
			LOGGER.info("Error");
		return emp.get();

	}

	// handson 4
	@Transactional
	public void save(Employee employee) {

		LOGGER.info("save method in EmployeeService Start");

		Employee save = employeeRepository.save(employee);

		LOGGER.debug("Employee:{}", save);

		LOGGER.info("save method in EmployeeService End");

	}
	
	// day 2 session 2 handson 1
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllPermanentEmployees();
	}
	
	// day 2 session 2 handson 4
	@Override
	public double getAverageSalary() {
		// TODO Auto-generated method stub
		return employeeRepository.getAverageSalary();
	}

	// session 2 hand'son 4
	@Override
	public double getAverageSalaryByDept(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.getAverageSalary(id);
	}

	@Override
	public List<Employee> getAllEmployeesNative() {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployeesNative();
	}
	
	
}
