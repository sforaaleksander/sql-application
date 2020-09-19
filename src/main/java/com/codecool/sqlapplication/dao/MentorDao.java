package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Mentor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class MentorDao extends PostgresDao<Mentor> {

    public MentorDao(String tableName) {
        super("mentors");
    }

    @Override
    Mentor create(ResultSet rs) throws SQLException {
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String phoneNumber = rs.getString("phone_number");
        String email = rs.getString("email");
        String nickName = rs.getString("nick_name");
        String city = rs.getString("city");
        int favouriteNumber = rs.getInt("favourite_number");
        return new Mentor(firstName, lastName, phoneNumber, email, nickName, city, favouriteNumber);
    }

    @Override
    public void update(Mentor object) {

    }

    @Override
    public void remove(Mentor object) {

    }

    @Override
    public void insert(Mentor object) {

    }

    @Override
    public List<Mentor> getObjects(String columnName, String columnValue) {
        return null;
    }
}
