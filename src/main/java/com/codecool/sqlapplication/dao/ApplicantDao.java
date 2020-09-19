package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.App;
import com.codecool.sqlapplication.models.Applicant;
import com.codecool.sqlapplication.models.Mentor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public class ApplicantDao extends PostgresDao<Applicant> {

    public ApplicantDao() {
        super("applicants");
    }

    @Override
    Applicant create(ResultSet rs) throws SQLException {
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String phoneNumber = rs.getString("phone_number");
        String email = rs.getString("email");
        int applicationCode = rs.getInt("application_code");
        return new Applicant(firstName, lastName, phoneNumber, email, applicationCode);
    }


    @Override
    public Optional<Applicant> getById(Long id) {
        return getElementById(id);
    }

    @Override
    public boolean insert(Applicant applicant) {
        return insertElement(applicant);

    }

    @Override
    public boolean update(Applicant applicant) {
        return updateElement(applicant);

    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<Applicant> getAll() {
        return getAllElements();
    }

    @Override
    protected PreparedStatement constructPreparedStatementForUpdate(Applicant applicant, Connection connection) {
        long id = applicant.getId();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE applicants SET " +
                    "first_name=?, last_name=?, phone_number=?, email=?, city=?, application_code=? " +
                    " WHERE id = ?");
            preparedStatement = setValuesOnPreparedStatement(applicant, preparedStatement);
            preparedStatement.setLong(8, applicant.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }

    @Override
    protected PreparedStatement constructPreparedStatementForInsert(Applicant applicant, Connection connection) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO applicants" +
                    "(first_name, last_name, phone_number, email, city, application_code ) VALUES " +
                    "(?, ?, ?, ?, ?, ?)");
            preparedStatement = setValuesOnPreparedStatement(applicant, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;    }

    private PreparedStatement setValuesOnPreparedStatement(Applicant applicant, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, applicant.getFirstName());
        preparedStatement.setString(2, applicant.getLastName());
        preparedStatement.setString(4, applicant.getPhoneNumber());
        preparedStatement.setString(5, applicant.getEmail());
        preparedStatement.setInt(7, applicant.getApplicationCode());
        return preparedStatement;
    }

//    SELECT concat(first_name, ' ',  last_name, ' ' , phone_number) AS full_name from applicants WHERE first_name='Carol';

    public void getCarol(){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT concat(first_name, ' ',  last_name, ' ' , phone_number) AS full_name from applicants WHERE first_name='Carol';");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("full_name"));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
