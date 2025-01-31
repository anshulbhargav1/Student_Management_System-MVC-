package com.anshul.service;

import com.anshul.beans.Student;
import com.anshul.dao.StudentDao;
import com.anshul.factory.StudentDaoFactory;


import java.util.List;


public class StudentServiceImpl implements StudentService {


    StudentDao studentDao = StudentDaoFactory.getStudentDao();
    @Override
    public String addStudent(Student student) {
        String status = studentDao.add(student);
        return status;
    }


    @Override
    public Student searchStudent(String sid) {
        Student student = studentDao.search(sid);
        return student;
    }


    @Override
    public List<Student> searchAllStudent() {
        List<Student> students = studentDao.searchAll();
        return students;
    }


    @Override
    public String updateStudent(Student student) {
        String status = studentDao.update(student);
        return status;
    }


    @Override
    public String deleteStudent(String sid) {
        String status = studentDao.delete(sid);
        return status;
    }
}

