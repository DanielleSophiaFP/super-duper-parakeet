/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeeapp;
/**
 *
 * @author Mico Uy
 */
public class Manager {
    private String shift;
    private String address;
    private String payroll;
    private int department;

    // Example fields for calculations
    private float hoursWorked;
    private float bonus;
    private float deductions;
    private float netPay;

    // Getter and Setter for shift
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for payroll
    public String getPayroll() {
        return payroll;
    }

    public void setPayroll(String payroll) {
        this.payroll = payroll;
    }

    // Getter and Setter for department
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    // Calculation methods
    public float calcNumberOfHoursWorked() {
        // Example logic
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float calcBonus() {
        // Example logic
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calcDeductions() {
        // Example logic
        return deductions;
    }

    public void setDeductions(float deductions) {
        this.deductions = deductions;
    }

    public float getNetPay() {
        // Example logic: netPay = (hoursWorked * hourlyRate) + bonus - deductions
        return netPay;
    }

    public void setNetPay(float netPay) {
        this.netPay = netPay;
    }


    public static void main(String[] args) {
        // Example usage of the Manager class
        Manager manager = new Manager();
        manager.setShift("Morning");
        manager.setAddress("123 Main St");
        manager.setPayroll("Monthly");
        manager.setDepartment(1);

        System.out.println("Manager Shift: " + manager.getShift());
        System.out.println("Manager Address: " + manager.getAddress());
        System.out.println("Manager Payroll: " + manager.getPayroll());
        System.out.println("Manager Department: " + manager.getDepartment());
    }
}

