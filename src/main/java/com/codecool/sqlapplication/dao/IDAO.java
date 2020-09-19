package com.codecool.sqlapplication.dao;

import com.codecool.sqlapplication.models.Mentor;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDAO<T> {

    Optional<T> getById(Long id);

    boolean insert(T t);

    boolean update(T t);

    boolean delete(Long id);

    List<T> getAll();
}

