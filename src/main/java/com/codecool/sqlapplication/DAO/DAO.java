package com.codecool.sqlapplication.DAO;

import java.util.List;

public interface DAO<T> {

    void update(T object);

    void remove(T object);

    void insert(T object);

    List<T> getObjects(String columnName, String columnValue);
}

