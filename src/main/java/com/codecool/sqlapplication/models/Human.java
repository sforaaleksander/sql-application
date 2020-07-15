package com.codecool.sqlapplication.models;

public abstract class Human {
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
}
