package com.lea.domain;

public class Student {
    private String name;
    private String sid;

    public Student() {
    }

    public Student(String name, String sid) {
        this.name = name;
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }
}
