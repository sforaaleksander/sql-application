package com.codecool.sqlapplication.models;

public class Applicant extends Human{
    int applicationCode;

    public Applicant(String firstName, String lastName, String phoneNumber, String email, int applicationCode){
        super(firstName, lastName, phoneNumber, email);
        this.applicationCode = applicationCode;
    }
}