package com.codecool.sqlapplication.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDAO<T> {

    T getById(Long id) throws SQLException, ClassNotFoundException;

    boolean insert(T t) throws ClassNotFoundException, SQLException;

    boolean update(T t) throws ClassNotFoundException, SQLException;

    boolean delete(Long id) throws ClassNotFoundException;

    List<T> getAll() throws SQLException, ClassNotFoundException;
}

