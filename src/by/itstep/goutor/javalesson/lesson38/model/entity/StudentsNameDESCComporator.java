package by.itstep.goutor.javalesson.lesson38.model.entity;

import java.util.Comparator;

public class StudentsNameDESCComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getAge() - o2.getAge();
            if (result == 0) {

            }
        }
        return 0;
    }
}
