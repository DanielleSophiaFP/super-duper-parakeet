/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

/**
 *
 * @author basil
 */
public class Employee {
    private int employeeID;
    private String name;
    private String position;

    public Employee(int employeeID, String name, String position) {
        if (employeeID <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void updateInfo(String name, String position) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
        if (position != null && !position.trim().isEmpty()) {
            this.position = position;
        }
    }

    public String getDetails() {
        return "ID: " + employeeID + ", Name: " + name + ", Position: " + position;
    }
}
