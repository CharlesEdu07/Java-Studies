package br.com.charlesedu.entities;

import java.util.List;

public class Student extends User {

    public Student(Integer id, String name) {
        super(id, name);
    }

    public Student(Integer id, List<Course> courses) {
        super(id, courses);
    }
}
