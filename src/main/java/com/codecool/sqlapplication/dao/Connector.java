package com.codecool.sqlapplication.dao;

import java.sql.*;

public class Connector {

    java.sql.Connection connection;

    private final String user = "sqldictator";
    private final String password = "9e5b86b4994947d6c5da7f4ff39f2221c60e9bc44a8ec2785bd472a0e6604b9b";
    private static final String CONNECTION_STRING = "jdbc:postgresql://ec2-54-246-85-151.eu-west-1.compute.amazonaws.com:5432/d38udvntvo8fhl";
    static int counter = 0;


    public Connection Connect() {
        connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(CONNECTION_STRING, user, password);
            System.out.println(++counter);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
