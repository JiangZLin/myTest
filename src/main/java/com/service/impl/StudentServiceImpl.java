package com.service.impl;

import com.jzl.dao.StudentDao;
import com.jzl.entity.Student;
import com.jzl.util.MyBatisUtils;
import com.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = MyBatisUtils.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(Integer id) {
        Student student = studentDao.getById(id);
        return student;
    }

    @Override
    public List<Student> getAll() {
        List<Student> list = studentDao.getAll();
        return list;
    }
}
