package com.holiday.project.repository;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

@Column(name = "first_name")
        private String firstName;
    @Id
@Column(name = "emp_num")
    private String empNum;

    public Employee() {}

    public String getFirstName() {
            return firstName;
        }

    public void setFirstName( String first_name ) {
            this.firstName = first_name;
        }

    public String getEmpNum() { return empNum; }

    public void setEmpNum(String empNum) { this.empNum = empNum; }
}