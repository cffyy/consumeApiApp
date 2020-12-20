package com.holiday.project.controller;

import com.holiday.project.repository.EmployeeRepository;
import com.holiday.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @Autowired
    private EmployeeRepository employeeService;


    @GetMapping(value = "/student")
    public @ResponseBody
    String getTestData() {
return employeeService.findAll().get(0).getFirstName();
    }
}