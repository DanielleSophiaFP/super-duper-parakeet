/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

/**
 *
 * @author basil
 */
public class Account {
    private int employeeID;
    private String username;
    private String password;

    public Account(int employeeID, String username, String password) {
        if (employeeID <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters.");
        }
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
