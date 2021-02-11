package com.gfs.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gfs.project.repository.Employee;
import com.gfs.project.service.EmployeeService;

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
        
        @GetMapping(value = "/addEmployee")
        String addEmployeeCount() {
        return employeeService.add();
            }
        
        @GetMapping(value = "/consume")
        String consume() {
		RestTemplate rt = new RestTemplate();
		String hi = rt.getForObject("http://localhost:8081/hello", String.class);
		return hi;
        }

    }