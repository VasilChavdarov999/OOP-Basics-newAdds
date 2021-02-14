package demo;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<Double> grades;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
}
