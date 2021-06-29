package com.cognizant.ormlearnformapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearnformapping.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// day 2 session 2 handson 2
	// @Query(value = "SELECT e FROM Employee e WHERE e.permanent = 1")
	@Query(value = "SELECT e FROM Employee e left join fetch e.department d left join fetch e.skillList WHERE e.permanent = 1")
	List<Employee> getAllPermanentEmployees();

	// day 2 session 2 handson 4
	@Query(value = "SELECT AVG(e.salary) FROM Employee e")
	double getAverageSalary();
	
	// session 2 hand'son 4
	@Query(value="SELECT AVG(e.salary) FROM Employee e where e.department.id = :id")
	double getAverageSalary(@Param("id") int id);
	
	// session 2 hand'son 5
	@Query(value="SELECT * FROM employee", nativeQuery = true)
	List<Employee> getAllEmployeesNative();

}
