package br.com.charlesedu.entities;

import java.util.List;

public class Instructor extends User {

    public Instructor(Integer id, String name) {
        super(id, name);
    }

    public Instructor(Integer id, List<Course> courses) {
        super(id, courses);
    }
}
