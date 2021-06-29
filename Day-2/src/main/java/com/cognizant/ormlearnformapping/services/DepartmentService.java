package com.cognizant.ormlearnformapping.services;

import org.springframework.stereotype.Service;

import com.cognizant.ormlearnformapping.model.Department;

@Service
public interface DepartmentService {

	public Department getById(int id);

	public void save(Department department);

}
