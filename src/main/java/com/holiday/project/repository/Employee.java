package com.holiday.project.repository;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
@Id
@Column(name = "first_name")
        private String firstName;

        public Employee() {}

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName( String first_name ) {
            this.firstName = first_name;
        }
}