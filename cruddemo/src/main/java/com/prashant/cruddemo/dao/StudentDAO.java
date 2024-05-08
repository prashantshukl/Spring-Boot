package com.prashant.cruddemo.dao;

import com.prashant.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer Id);
}
