package com.codecool.sqlapplication.models;

public abstract class User {
    private String firstName;
    private String lastName;
    private String nickName;
    private String phoneNumber;
    private String email;
    private String city;
    private Integer favouriteNumber;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getFavouriteNumber() {
        return favouriteNumber;
    }

    public void setFavouriteNumber(Integer favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }
}
