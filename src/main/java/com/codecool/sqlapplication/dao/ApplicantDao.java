package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Applicant;

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
                    "(first_name, last_name, phone_number, email, application_code ) VALUES " +
                    "(?, ?, ?, ?, ?)");
            preparedStatement = setValuesOnPreparedStatement(applicant, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;    }

    private PreparedStatement setValuesOnPreparedStatement(Applicant applicant, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, applicant.getFirstName());
        preparedStatement.setString(2, applicant.getLastName());
        preparedStatement.setString(3, applicant.getPhoneNumber());
        preparedStatement.setString(4, applicant.getEmail());
        preparedStatement.setInt(5, applicant.getApplicationCode());
        return preparedStatement;
    }

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

    public void getCarol2(){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT concat(first_name, ' ',  last_name, ' ' , phone_number) AS full_name from applicants WHERE email LIKE '%adipiscingenimmi.edu';");
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
    public void getByApplicationCode(long id){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * from applicants WHERE id = ?;");
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Applicant a = create(rs);
                System.out.println(a.toString());
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateJemina(){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE applicants SET phone_number='003670/223-7459' WHERE first_name='Jemima' AND last_name='Foreman';");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTwoGuys(){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE from applicants WHERE email LIKE '%@mauriseu.net';");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
