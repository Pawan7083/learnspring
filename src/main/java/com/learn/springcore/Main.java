/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learn.springcore;

import com.learn.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Pawan Kumar
 */
public class Main {
   public static void main(String arg[]){
       try{
           ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Student student=(Student) context.getBean("student1");
       System.out.println(student);
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
               
   }
}
