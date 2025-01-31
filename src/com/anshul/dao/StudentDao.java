package com.anshul.dao;


import com.anshul.beans.Student;


import java.util.List;


public interface StudentDao {
    public String add(Student student);
    public Student search(String sid);
    public List<Student> searchAll();
    public String update(Student student);
    public String delete(String sid);
}
