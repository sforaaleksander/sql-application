package com.codecool.sqlapplication.models;

public class Applicant extends User{
    private int applicationCode;
    public Applicant(int applicationCode) {
        super();
        this.applicationCode = applicationCode;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(int applicationCode) {
        this.applicationCode = applicationCode;
    }
}