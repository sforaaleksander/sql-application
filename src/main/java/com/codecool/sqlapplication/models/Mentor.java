package com.codecool.sqlapplication.models;

public class Mentor {
    private String firstName;
    private String lastName;
    private String nickName;
    private String phoneNumber;
    private String email;
    private String city;
    private Integer favouriteNumber;

    public Mentor(){}

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

    public void setCity(String city) {
        this.city = city;
    }

    public void setFavouriteNumber(Integer favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCity() {
        return city;
    }

    public Integer getFavouriteNumber() {
        return favouriteNumber;
    }

    public Object[] toObjectArray(){
        return new Object[]{this.firstName, this.lastName, this.nickName, this.phoneNumber, this.email, this.city, this.favouriteNumber};
    }
}
