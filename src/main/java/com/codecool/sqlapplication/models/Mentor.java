package com.codecool.sqlapplication.models;

public class Mentor extends Human {
    String nickName;
    int favouriteNumber;

    Mentor(String firstName, String lastName, String nickName, String phoneNumber, String email, String city, int favouriteNumber){
        super(firstName, lastName, phoneNumber, email);
        this.nickName = nickName;
        this.favouriteNumber = favouriteNumber;
    }
}
