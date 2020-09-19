package com.codecool.sqlapplication.dao;

import java.util.List;

public interface IDAO<T> {

    boolean update(T object);

    boolean remove(T object);

    boolean insert(T object);

    List<T> getObjects(String columnName, String columnValue);
}

