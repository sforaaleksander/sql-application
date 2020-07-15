package com.codecool.sqlapplication;

import com.codecool.sqlapplication.models.Applicant;

import java.util.List;

public class ApplicantSQLJDBC extends PostgreSQLJDBC<Applicant> {

    @Override
    public void update(Applicant applicant) {

    }

    @Override
    public void remove(Applicant applicant) {

    }

    @Override
    public void insert(Applicant applicant) {
        String template = "INSERT INTO applicants (first_name, last_name, phone_number, email, application_code)";
//        connection.prepareStatement()
    }

    @Override
    public List getObjects(String columnName, String columnValue) {
        return null;
    }
}
