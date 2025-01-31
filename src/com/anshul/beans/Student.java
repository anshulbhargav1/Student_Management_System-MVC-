package com.anshul.beans;


public class Student {
    private String sid;
    private String sname;
    private String saddr;


    public Student(String sid, String sname, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }


    public Student() {
    }


    public String getSid() {
        return sid;
    }


    public void setSid(String sid) {
        this.sid = sid;
    }


    public String getSname() {
        return sname;
    }


    public void setSname(String sname) {
        this.sname = sname;
    }


    public String getSaddr() {
        return saddr;
    }


    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", saddr='" + saddr + '\'' +
                '}';
    }
}
