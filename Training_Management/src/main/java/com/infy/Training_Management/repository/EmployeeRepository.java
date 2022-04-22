package com.infy.Training_Management.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.infy.Training_Management.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
