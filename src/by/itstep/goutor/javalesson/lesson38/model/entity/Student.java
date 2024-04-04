package by.itstep.goutor.javalesson.lesson38.model.entity;

import java.lang.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Student extends Object implements Comparable<Student> {
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
                '}';
    }

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("Alex", 12, 2));

//        Set<Integer> set = new TreeSet<>();
//        set.add(5);
//        set.add(67);
//        set.add(12);
//        set.add(7);
//        set.add(89);
//        set.add(111);
//        set.add(3);
//        set.add(5);
//        set.add(67);
//
//        System.out.println(set);


    }

    @Override
    public int compareTo(Student o) {
        if(mark >o.mark){
            return 1;
        }else if(mark< o.mark){
            return -1;
        }
        return 0;
    }
}
