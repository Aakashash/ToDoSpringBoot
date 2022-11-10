package com.example.demo;

public class Course {

    public int id;
    public String coursename;
    public String department;

    public Course(int id, String coursename, String department) {
        this.id = id;
        this.coursename = coursename;
        this.department = department;
    }



    public int getId() {
        return id;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
