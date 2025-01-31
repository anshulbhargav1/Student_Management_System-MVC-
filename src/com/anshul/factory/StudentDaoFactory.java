package com.anshul.factory;


import com.anshul.dao.StudentDao;
import com.anshul.dao.StudentDaoImpl;


public class StudentDaoFactory {
    private static StudentDao studentDao;
    static {
        studentDao = new StudentDaoImpl();
    }
    public static StudentDao getStudentDao() {
        return studentDao;
    }
}
