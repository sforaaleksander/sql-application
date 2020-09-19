package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.App;
import com.codecool.sqlapplication.models.Applicant;
import com.codecool.sqlapplication.models.Mentor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ApplicantDao extends PostgresDao<Applicant> {

    public ApplicantDao(String tableName) {
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
    public void update(Applicant object) {

    }

    @Override
    public void remove(Applicant object) {

    }

    @Override
    public void insert(Applicant object) {

    }

    @Override
    public List<Applicant> getObjects(String columnName, String columnValue) {
        return null;
    }
}
