package com.anshul.dao;


import com.anshul.beans.Student;
import com.anshul.factory.ConnectionFactory;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {


    @Override
    public String add(Student student) {
        String status = "";
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate(
                    "insert into STUDENT values('" + student.getSid() + "','" + student.getSname() + "','" + student.getSaddr() + "')"
            );
            if (rowCount == 1) {
                status = "SUCCESS";
            } else {
                status = "FAILURE";
            }




        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


    @Override
    public Student search(String sid) {
        Student student = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student where sid = '" + sid + "'");
            if (resultSet.next()) {
                student = new Student();
                student.setSid(resultSet.getString("SID"));
                student.setSname(resultSet.getString("SNAME"));
                student.setSaddr(resultSet.getString("SADDR"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }


    @Override
    public List<Student> searchAll() {
        List<Student> students = new ArrayList<>();
        try{
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from JAVA.STUDENT");
            while (resultSet.next()) {
                Student student = new Student();
                student.setSid(resultSet.getString("SID"));
                student.setSname(resultSet.getString("SNAME"));
                student.setSaddr(resultSet.getString("SADDR"));
                students.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }


    @Override
    public String update(Student student) {
        String status = "";
        try{
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate("update STUDENT set SNAME = '"+student.getSname()+"', SADDR = '"+student.getSaddr()+"' where SID = '" + student.getSid() + "'");
            if (rowCount == 1) {
                status = "SUCCESS";
            }else{
                status = "FAILURE";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


    @Override
    public String delete(String sid) {
        String status = "";
        try{
            Connection connection = ConnectionFactory.getConnection();
            Statement statement = connection.createStatement();
            int rowCount = statement.executeUpdate("delete from STUDENT where SID = '" + sid+ "'");
            if (rowCount == 1) {
                status = "SUCCESS";
            }else{
                status = "FAILURE";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
