package com.codecool.sqlapplication.models;

public class Applicant extends User{
    private int applicationCode;
    public Applicant(String firstName, String lastName, String phoneNumber, String email, int applicationCode) {
        super(firstName, lastName, phoneNumber, email);
        this.applicationCode = applicationCode;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(int applicationCode) {
        this.applicationCode = applicationCode;
    }
}