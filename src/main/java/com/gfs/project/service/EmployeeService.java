package com.gfs.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfs.project.repository.Employee;
import com.gfs.project.repository.EmployeeRepository;

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
    public String add() {
    	Employee entity = new Employee();
    	entity.setEmpNum("3");
    	entity.setFirstName("Monica");
    	employeeRepository.save(entity);
    	return "Add Successful";
    }
}