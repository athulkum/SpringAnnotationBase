package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //this annotation tells to the spring container instance of below class
public class Student {

    @Value("101")
    private  int id;
    @Value("Athul")
    private  String name;

    @Value("99.8")
    private double marks;

    private Student(){
        super();
    }

    public Student(int id, double marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public  void  display(){

        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("marks="+marks);

    }
}
