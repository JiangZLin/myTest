package com.service;

import com.jzl.entity.Student;

import java.util.List;

public interface StudentService {
    public Student getById(Integer id);

    List<Student> getAll();
}
