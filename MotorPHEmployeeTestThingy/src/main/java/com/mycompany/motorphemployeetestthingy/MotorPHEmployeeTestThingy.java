/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorphemployeetestthingy;

import java.util.Date;

/**
 *
 * @author basil
 */
public class MotorPHEmployeeTestThingy {
    public static void main(String[] args) {
        try {
            // Create an administrator
            Administrator admin = new Administrator();

            // Create employees
            admin.generateEmployee(1, "John Doe", "Developer");
            admin.generateEmployee(2, "Jane Smith", "Manager");

            // Create a manager
            Manager manager = new Manager(3, "Alice Johnson", "Senior Manager", 5);
            System.out.println(manager.getDetails());
            manager.assignTask("Project Review");

            // Set attendance
            admin.setAttendance(1, new Date(), true);
            admin.setAttendance(2, new Date(), false);

            // Modify employee
            System.out.println(admin.modifyEmployee(1, "John Updated", "Senior Developer"));

            // Create and display salary
            Salary salary = new Salary(1, 5000.0, 1000.0);
            System.out.println(salary.getSalaryDetails());

            // Create and display account
            Account account = new Account(1, "johndoe", "securepass123");
            System.out.println("Account username: " + account.getUsername());
            System.out.println("Authentication: " + account.authenticate("securepass123"));

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
