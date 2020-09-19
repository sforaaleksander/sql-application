package com.codecool.sqlapplication.dao;

import java.sql.*;

public class Connector {

    java.sql.Connection connection;

    private final String user = "sqldictator";
    private final String password = "123";
    private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/assignmentdb";
    static int counter = 0;


    public Connection Connect() {
        connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(CONNECTION_STRING, user, password);
            System.out.println("opened connection: " + ++counter);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
