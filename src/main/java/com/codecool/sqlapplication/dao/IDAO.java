package com.codecool.sqlapplication.dao;

import java.util.List;

public interface IDAO<T> {

    void update(T object);

    void remove(T object);

    void insert(T object);

    List<T> getObjects(String columnName, String columnValue);
}

