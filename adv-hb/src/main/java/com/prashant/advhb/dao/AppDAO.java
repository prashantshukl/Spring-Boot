package com.prashant.advhb.dao;

import com.prashant.advhb.entity.Instructor;
import com.prashant.advhb.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
    InstructorDetail findInstructorDetailById(int id);
}
