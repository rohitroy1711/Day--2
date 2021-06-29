package com.cognizant.ormlearnformapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearnformapping.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
