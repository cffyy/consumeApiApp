package com.holiday.project.controller;

import com.holiday.project.repository.EmployeeRepository;
import com.holiday.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRestController{

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/hello")
    String hello() {
        return "Hello User";
    }
    @GetMapping(value = "/errorPage")
    String errorPage() {
        return "Error Redirect";
    }

    @GetMapping(value = "/employeeName")
    String getEmployeeName() {
    String dbData = employeeService.list().get(0).getFirstName();
    return dbData;
        }

    }