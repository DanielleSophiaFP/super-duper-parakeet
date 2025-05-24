/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salary.salary;

/**
 *
 * @author jamesangeles
 */
public class Salary {
    // Fields
    private String name;
    private String employeeID;
    private String position;
    private String date;

    // Constructor
    public Salary(String name, String employeeID, String position, String date) {
        this.name = name;
        this.employeeID = employeeID;
        this.position = position;
        this.date = date;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // toString method to display salary info
    @Override
    public String toString() {
        return "Salary Details:\n" +
               "Name: " + name + "\n" +
               "Employee ID: " + employeeID + "\n" +
               "Position: " + position + "\n" +
               "Date: " + date;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Salary employeeSalary = new Salary("John Doe", "E12345", "Software Engineer", "2025-05-24");
        System.out.println(employeeSalary);
    }
}


    