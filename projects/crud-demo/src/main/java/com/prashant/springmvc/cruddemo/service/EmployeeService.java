package com.prashant.springmvc.cruddemo.service;

import com.prashant.springmvc.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee findById(int id);
    public List<Employee> findAll();
    public void deleteById(int id);
    public Employee save(Employee employee);
}
