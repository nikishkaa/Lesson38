package by.itstep.goutor.javalesson.lesson38.model.entity;

import java.lang.*;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int mark;

    public Student() {
        age = 16;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && mark == student.mark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}'  ;
    }

    public static void main(String[] args) {
        Student student = new Student("Alex", 12, 2);
        System.out.println(student);
    }
}
