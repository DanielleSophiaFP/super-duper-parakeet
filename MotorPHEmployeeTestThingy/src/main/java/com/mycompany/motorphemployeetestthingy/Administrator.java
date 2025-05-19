/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

/**
 *
 * @author basil
 */
import java.util.ArrayList;
import java.util.Date;

public class Administrator {
    private ArrayList<Employee> employees;
    private ArrayList<Attendance> attendanceRecords;

    public Administrator() {
        this.employees = new ArrayList<>();
        this.attendanceRecords = new ArrayList<>();
    }

    public void generateEmployee(int employeeID, String name, String position) {
        Employee emp = new Employee(employeeID, name, position);
        employees.add(emp);
        System.out.println("Employee " + name + " created.");
    }

    public void removeEmployee(int employeeID) {
        boolean removed = employees.removeIf(emp -> emp.getEmployeeID() == employeeID);
        if (removed) {
            System.out.println("Employee ID " + employeeID + " removed.");
        } else {
            System.out.println("Employee ID " + employeeID + " not found.");
        }
    }

    public void setAttendance(int employeeID, Date date, boolean status) {
        attendanceRecords.add(new Attendance(employeeID, date, status));
        System.out.println("Attendance for Employee ID " + employeeID + " set: " + (status ? "Present" : "Absent"));
    }

    public String modifyEmployee(int employeeID, String newName, String newPosition) {
        for (Employee emp : employees) {
            if (emp.getEmployeeID() == employeeID) {
                emp.updateInfo(newName, newPosition);
                return "Employee ID " + employeeID + " details modified.";
            }
        }
        return "Employee ID " + employeeID + " not found.";
    }
}
