package com.codecool.sqlapplication.models;

public class Mentor extends Human {
    String nickName;
    String city;
    Integer favouriteNumber;

    public Mentor(String firstName, String lastName, String nickName, String phoneNumber, String email, String city, int favouriteNumber){
        super(firstName, lastName, phoneNumber, email);
        this.nickName = nickName;
        this.city = city;
        this.favouriteNumber = favouriteNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCity() {
        return city;
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }

    public Object[] toObjectArray(){
        return new Object[]{this.firstName, this.lastName, this.nickName, this.phoneNumber, this.email, this.city, this.favouriteNumber};
    }
}
