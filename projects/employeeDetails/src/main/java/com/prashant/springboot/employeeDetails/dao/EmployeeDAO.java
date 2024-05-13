package com.prashant.springboot.employeeDetails.dao;

import com.prashant.springboot.employeeDetails.enitity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
