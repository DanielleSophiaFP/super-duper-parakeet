/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

/**
 *
 * @author basil
 */
public class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String name, String position, int teamSize) {
        super(employeeID, name, position);
        if (teamSize < 0) {
            throw new IllegalArgumentException("Team size cannot be negative.");
        }
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void assignTask(String task) {
        System.out.println("Manager " + getName() + " assigned task: " + task);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Team Size: " + teamSize;
    }
}
