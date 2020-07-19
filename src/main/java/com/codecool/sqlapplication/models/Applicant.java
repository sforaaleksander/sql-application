package com.codecool.sqlapplication.models;

public class Applicant{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int applicationCode;

    public Applicant(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setApplicationCode(int applicationCode) {
        this.applicationCode = applicationCode;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public Object[] toObjectArray(){
        return new Object[]{this.firstName, this.lastName, this.phoneNumber, this.email, this.applicationCode};
    }
}