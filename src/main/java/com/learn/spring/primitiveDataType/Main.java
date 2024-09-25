/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.spring.primitiveDataType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Pawan Kumar
 */
public class Main {
    public static void main(String are[]){
        ApplicationContext context= new ClassPathXmlApplicationContext("com/learn/spring/primitive/config.xml");
        Student student1=context.getBean("student1", Student.class);
        Student student2=context.getBean("student2", Student.class);
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
//776700275
//118394766
