package com.main;

import com.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext  context = new ClassPathXmlApplicationContext("/com/resource/applicationContext.xml");
        Student student = (Student) context.getBean(Student.class);

       student.display();
    }
}