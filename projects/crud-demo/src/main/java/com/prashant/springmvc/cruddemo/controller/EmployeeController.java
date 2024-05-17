package com.prashant.springmvc.cruddemo.controller;


import com.prashant.springmvc.cruddemo.entity.Employee;
import com.prashant.springmvc.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService theService;


    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        theService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> employees = theService.findAll();
        theModel.addAttribute("employees", employees);
        return "employees/list-employees";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel) {
        Employee employee = new Employee();
        theModel.addAttribute("employee", employee);
        return "employees/add-employee-form";
    }

    @PostMapping("/saveForm")
    public String saveForm(@ModelAttribute("employee") Employee theEmployee) {
        theService.save(theEmployee);
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showUpdate(@RequestParam("employeeId") int theId, Model theModel) {
        Employee employee = theService.findById(theId);
        theModel.addAttribute("employee", employee);
        return "employees/add-employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {
        theService.deleteById(theId);
        return "redirect:/employees/list";
    }
}
