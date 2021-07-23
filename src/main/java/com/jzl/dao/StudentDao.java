package com.jzl.dao;

import com.jzl.entity.Student;
import com.jzl.vo.StudentAndClassroomVO;

import java.util.List;

public interface StudentDao {
    Student getById(Integer id);

    List<Student> getAll();

    List<StudentAndClassroomVO> stuAndclass(String name);
}
