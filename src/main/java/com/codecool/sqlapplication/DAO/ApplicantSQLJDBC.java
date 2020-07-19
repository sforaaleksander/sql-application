package com.codecool.sqlapplication.DAO;

import com.codecool.sqlapplication.models.Applicant;

import java.util.List;

public class ApplicantSQLJDBC extends PostgreSQLJDBC<Applicant> implements DAO<Applicant> {

    ApplicantSQLJDBC(){
        this.table = "applicants";
        this.columns = new String[]{"first_name", "last_name", "phone_number", "email", "application_code"};
    }


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
