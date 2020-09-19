package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Mentor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public class MentorDao extends PostgresDao<Mentor> {

    public MentorDao() {
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
    public Optional<Mentor> getById(Long id) {
        return getElementById(id);
    }

    @Override
    public boolean insert(Mentor mentor) {
        return insertElement(mentor);
    }

    @Override
    public boolean update(Mentor mentor) {
        return updateElement(mentor);
    }

    @Override
    public boolean delete(Long id) {
        return deleteElement(id);
    }

    @Override
    public List<Mentor> getAll() {
        return getAllElements();
    }


    @Override
    protected PreparedStatement constructPreparedStatementForUpdate(Mentor mentor, Connection connection) {
        long id = mentor.getId();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE mentors SET" +
                    "first_name=?, last_name=?, nick_name=?, phone_number=?, email=?, city=?, favourite_number=? " +
                    " WHERE id = ?");
            preparedStatement = setValuesOnPreparedStatement(mentor, preparedStatement);
            preparedStatement.setLong(8, mentor.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement constructPreparedStatementForInsert(Mentor mentor, Connection connection) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO mentors" +
                    "(first_name, last_name, nick_name, phone_number, email, city, favourite_number ) VALUES " +
                    "(?, ?, ?, ?, ?, ?, ?)");
            preparedStatement = setValuesOnPreparedStatement(mentor, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    private PreparedStatement setValuesOnPreparedStatement(Mentor mentor, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, mentor.getFirstName());
        preparedStatement.setString(2, mentor.getLastName());
        preparedStatement.setString(3, mentor.getNickName());
        preparedStatement.setString(4, mentor.getPhoneNumber());
        preparedStatement.setString(5, mentor.getEmail());
        preparedStatement.setString(6, mentor.getCity());
        preparedStatement.setInt(7, mentor.getFavouriteNumber());
        return preparedStatement;
    }
}
