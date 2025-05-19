/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphemployeetestthingy;

import java.util.Date;

/**
 *
 * @author basil
 */
public class Attendance {
    private int employeeID;
    private Date date;
    private boolean status;

    public Attendance(int employeeID, Date date, boolean status) {
        if (employeeID <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }
        this.employeeID = employeeID;
        this.date = date;
        this.status = status;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int viewAttendance() {
        return status ? 1 : 0;
    }

    public void updateStatus(boolean newStatus) {
        this.status = newStatus;
    }

    public String keepRecord() {
        return "Attendance for Employee ID " + employeeID + " on " + date + ": " + (status ? "Present" : "Absent");
    }
}
