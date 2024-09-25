/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.entities;

/**
 *
 * @author Pawan Kumar
 */
public class Student {
    private int id;
    private String name;
    private String course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public Student(){
        
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", course=" + course + '}';
    }
    
}
