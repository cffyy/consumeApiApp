package com.holiday.project.service;

import com.holiday.project.repository.Employee;
import com.holiday.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> list() {
        return employeeRepository.findAll();
    }
    public long count() {
        return employeeRepository.count();
    }
}