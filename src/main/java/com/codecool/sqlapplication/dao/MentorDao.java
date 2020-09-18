package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Mentor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class MentorDao extends PostgresDao<Mentor> {

    public MentorDao(String tableName) {
        super("");
    }

    @Override
    Mentor create(ResultSet rs) throws SQLException {
        return null;
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
