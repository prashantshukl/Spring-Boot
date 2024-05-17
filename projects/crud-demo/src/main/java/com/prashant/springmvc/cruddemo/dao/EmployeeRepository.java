package com.prashant.springmvc.cruddemo.dao;

import com.prashant.springmvc.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
