package com.codecool.sqlapplication.models;

public class Mentor extends User{
    private String nickName;
    private String city;
    private Integer favouriteNumber;

    public Mentor(String nickName, String city, int favouriteNumber){
        super();
        this.nickName = nickName;
        this.city = city;
        this.favouriteNumber = favouriteNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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
