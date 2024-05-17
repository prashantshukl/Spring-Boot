package com.prashant.springmvc.cruddemo.service;

import com.prashant.springmvc.cruddemo.dao.EmployeeRepository;
import com.prashant.springmvc.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeDAO;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> temp = employeeDAO.findById(id);
        Employee emp = null;
        if (temp.isPresent()) {
            emp = temp.get();
        } else {
            throw new RuntimeException("Not found for :" + id);
        }
        return emp;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}