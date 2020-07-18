package com.codecool.sqlapplication.models;

public class Applicant extends Human{
    int applicationCode;

    public Applicant(String firstName, String lastName, String phoneNumber, String email, int applicationCode){
        super(firstName, lastName, phoneNumber, email);
        this.applicationCode = applicationCode;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public Object[] toArray(){
        return new Object[]{this.firstName, this.lastName, this.phoneNumber, this.email, this.applicationCode};
    }
}