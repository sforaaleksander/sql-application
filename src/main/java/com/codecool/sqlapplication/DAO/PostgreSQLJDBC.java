package com.codecool.sqlapplication.DAO;

import java.sql.*;

public abstract class PostgreSQLJDBC implements DAO<DBObject>{
    protected static Connection connection;
    protected PreparedStatement statement;
    protected final String DB_NAME = "src/main/resources/postgres.db";
    protected final String CONNECTION_STRING = "jdbc:postgres:" + DB_NAME;
    protected String table;
    protected String[] columns;

//    protected static void connect() {
//        Connection c = null;
//        try {
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "student2019");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Opened database successfully");
//    }

    private ResultSet executeQuery(String query, DBObject object) {
        ResultSet resultSet = null;
        try {
            createStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    private void createStatement(String query) throws SQLException {
        connection = DriverManager.getConnection(CONNECTION_STRING);
        statement = connection.prepareStatement(query);
    }

    protected void updateRecord(DBObject object) {
        Integer id = object.toArray()[0];
        String query = "UPDATE " + table + " SET ";
    }

    protected void insertRecord(DBObject object){
        String columnsString = "(" + String.join(", ", columns) + ")";
        StringBuilder query = new StringBuilder("INSERT INTO" + table + columns + " VALUES ( ? )");
        for (int i=0; i<columns.length; i++) {
            query.append(", ?");
        } query.append(")");
        executeQuery(query.toString(), object);
    }
}

