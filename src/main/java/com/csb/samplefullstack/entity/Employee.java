package com.csb.samplefullstack.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb1_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private int name;
    private int location;
    private int department;

    public Employee(int id, int name, int location, int department) {
        employeeId = id;
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Employee(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
