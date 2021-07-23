package com.jzl.entity;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private String classroomid;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", classroomid='" + classroomid + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(String classroomid) {
        this.classroomid = classroomid;
    }
}
