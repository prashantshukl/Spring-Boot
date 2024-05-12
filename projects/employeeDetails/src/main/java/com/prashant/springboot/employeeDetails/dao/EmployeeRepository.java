package com.prashant.springboot.employeeDetails.dao;

import com.prashant.springboot.employeeDetails.enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
