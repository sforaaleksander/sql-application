package com.codecool.sqlapplication.models;

import com.codecool.sqlapplication.DAO.DBObject;

public abstract class Human implements DBObject {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;

    Human(String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
