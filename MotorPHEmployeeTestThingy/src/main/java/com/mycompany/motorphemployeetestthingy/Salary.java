/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

/**
 *
 * @author basil
 */
public class Salary {
    private int employeeID;
    private double baseSalary;
    private double bonus;

    public Salary(int employeeID, double baseSalary, double bonus) {
        if (employeeID <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return baseSalary + bonus;
    }

    public void updateBonus(double newBonus) {
        if (newBonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        this.bonus = newBonus;
    }

    public String getSalaryDetails() {
        return "Employee ID: " + employeeID + ", Base Salary: $" + baseSalary + ", Bonus: $" + bonus + ", Total: $" + calculateTotalSalary();
    }
}
