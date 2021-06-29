package com.cognizant.ormlearnformapping.services.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearnformapping.model.Department;
import com.cognizant.ormlearnformapping.repository.DepartmentRepository;
import com.cognizant.ormlearnformapping.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentServiceImpl.class);

	@Autowired
	public DepartmentRepository departmentRepository;

	// handson 4
	@Transactional
	public Department getById(int id) {

		LOGGER.info("GET by ID method in DepartmentService Start");

		return departmentRepository.findById(id).get();
	}

	// handson 4
	@Transactional
	public void save(Department department) {

		LOGGER.info("save method in DepartmentService Start");

		departmentRepository.save(department);

		LOGGER.info("save method in DepartmentService End");

	}
}
