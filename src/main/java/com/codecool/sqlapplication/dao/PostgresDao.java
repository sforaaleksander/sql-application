package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.exception.ElementNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class PostgresDao<T> implements IDAO<T> {
    public final String TABLENAME;

    public PostgresDao(String tableName) {

        TABLENAME = tableName;
    }

    protected Connection getConnection() {
        Connector connector = new Connector();
        return connector.Connect();
    }

    abstract T create(ResultSet rs) throws SQLException;


    protected boolean insertElement(T object){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = constructPreparedStatementForInsert(object, connection);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    protected boolean updateElement(T object){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = constructPreparedStatementForUpdate(object, connection);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    protected boolean deleteElement(Long id){
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM " + this.TABLENAME + " WHERE id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    protected abstract PreparedStatement constructPreparedStatementForUpdate(T object, Connection connection);

    protected abstract PreparedStatement constructPreparedStatementForInsert(T object, Connection connection);

    public List<T> getAllElements() {
        List<T> elements = new ArrayList<>();
        Connection connection = this.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM " + this.TABLENAME + ";");
            while (rs.next()) {
                elements.add(create(rs));
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException d) {
                d.printStackTrace();
            }
            e.printStackTrace();
        }
        return elements;
    }

    public Optional<T> getElementById(Long id) {
        T element;
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + this.TABLENAME + " WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                element = create(rs);
                rs.close();
                preparedStatement.close();
                connection.close();
                return Optional.of(element);
            }
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException d) {
                d.printStackTrace();
            }
            e.printStackTrace();
        }
        return Optional.empty();
    }
//
//    public Optional<T> getHighestIdElement() {
//        T element;
//        Connection connection = this.getConnection();
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * " +
//                    "FROM " + this.TABLENAME+ " order by id desc limit 1");
//            ResultSet rs = preparedStatement.executeQuery();
//            if (rs.next()) {
//                element = create(rs);
//                rs.close();
//                preparedStatement.close();
//                connection.close();
//                return Optional.of(element);
//            }
//        } catch (SQLException e) {
//            try {
//                connection.close();
//            } catch (SQLException d) {
//                d.printStackTrace();
//            }
//            e.printStackTrace();
//        }
//        return Optional.empty();
//    }
}
