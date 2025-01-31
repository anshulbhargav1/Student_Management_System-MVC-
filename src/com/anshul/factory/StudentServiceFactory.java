package com.anshul.factory;


import com.anshul.service.StudentService;
import com.anshul.service.StudentServiceImpl;


public class StudentServiceFactory {
    private static StudentService studentService;
    static {
        studentService = new StudentServiceImpl();
    }
    public static StudentService getStudentService() {
        return studentService;
    }
}
