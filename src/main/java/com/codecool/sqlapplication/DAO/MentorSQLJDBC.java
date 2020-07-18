package com.codecool.sqlapplication.DAO;

import com.codecool.sqlapplication.models.Mentor;

import java.util.List;

public class MentorSQLJDBC extends PostgreSQLJDBC<Mentor>{

    MentorSQLJDBC(){
        this.table = "mentors";
        this.columns = new String[]{"first_name", "last_name", "nick_name", "phone_number", "email", "city", "favourite_number"};
    }

    @Override
    public void update(Mentor mentor) {

    }

    @Override
    public void remove(Mentor mentor) {

    }

    @Override
    public void insert(Mentor mentor) {
//        connection.prepareStatement().executeQuery();
    }

    @Override
    public List getObjects(String columnName, String columnValue) {
        return null;
    }
}
