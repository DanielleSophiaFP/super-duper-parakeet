package com.mycompany.motorphapp;

import java.util.Map;

public class Administrator {
    public Employee generateEmployee(String employeeID, String lastName, String firstName) {
        return new Employee(employeeID, lastName, firstName);
    }
    public void removeEmployee(Map<String, Employee> employees, String employeeID) {
        employees.remove(employeeID);
    }
    public void setAttendance(Employee emp, Attendance att) {
        emp.addAttendance(att);
    }
    public void modifyEmployee(Employee emp, String newLastName, String newFirstName) {
        if (newLastName != null && !newLastName.isEmpty()) emp.setLastName(newLastName);
        if (newFirstName != null && !newFirstName.isEmpty()) emp.setFirstName(newFirstName);
    }
}
