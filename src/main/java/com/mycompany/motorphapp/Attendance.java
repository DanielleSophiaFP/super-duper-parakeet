package com.mycompany.motorphapp;

public class Attendance {
    private String date, logIn, logOut;

    public Attendance(String date, String logIn, String logOut) {
        this.date = date;
        this.logIn = logIn;
        this.logOut = logOut;
    }

    public String getDate() { return date; }
    public String getLogIn() { return logIn; }
    public String getLogOut() { return logOut; }

    @Override
    public String toString() {
        return date + " | Log In: " + logIn + " | Log Out: " + logOut;
    }
}
