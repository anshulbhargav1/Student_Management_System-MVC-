package com.anshul.service;


import com.anshul.beans.Student;


import java.util.List;


public interface StudentService {
    public String addStudent(Student student);
    public Student searchStudent(String sid);
    public List<Student> searchAllStudent();
    public String updateStudent(Student student);
    public String deleteStudent(String sid);
}

