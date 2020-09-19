package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Mentor;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    public boolean update(Mentor mentor) {
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO mentors" +
                    "(first_name, last_name, nick_name, phone_number, email, city, favourite_number ) VALUES " +
                    "(?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, mentor.getFirstName());
            preparedStatement.setString(2, mentor.getLastName());
            preparedStatement.setString(3, mentor.getNickName());
            preparedStatement.setString(4, mentor.getPhoneNumber());
            preparedStatement.setString(5, mentor.getEmail());
            preparedStatement.setString(6, mentor.getCity());
            preparedStatement.setInt(7, mentor.getFavouriteNumber());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(Mentor object) {

    }

    @Override
    public boolean insert(Mentor object) {

    }

    @Override
    public List<Mentor> getObjects(String columnName, String columnValue) {
        return null;
    }
}
