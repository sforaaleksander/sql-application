package com.codecool.sqlapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public abstract class PostgreSQLJDBC<T> implements DAO<T>{
    private static Connection connection;

    public static void connect() {
        Connection c = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "student2019"); // set user and password
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}

