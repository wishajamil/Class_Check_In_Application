package com.example.attend_in;

public class Student {

   private String name,id,classId,checktime;


    public Student(){}

    public Student(String name, String id,String classId,String checktime) {
        this.name = name;
        this.id = id;
        this.classId=classId;
        this.checktime=checktime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId(){return classId;}
    public void setClassId(String classId){this.classId=classId;}

    public String getTime(){return checktime;}
    public void setTime(String checktime){this.checktime=checktime;}
}
