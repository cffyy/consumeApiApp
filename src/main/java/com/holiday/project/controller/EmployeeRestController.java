package com.holiday.project.controller;

import com.holiday.project.repository.Employee;
import com.holiday.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeRestController{

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/hello")
    String hello() {
        return "Hello User";
    }

    @GetMapping(value = "/errorPaaage")
    String errorPage() {
        return "Error Redirect";
    }

    @GetMapping(value = "/employeeList")
    List<Employee> getEmployeeNameList() {
    return employeeService.list();
        }

        @GetMapping(value = "/employeeCount")
    long getEmployeeCount() {
    return employeeService.count();
        }

    }