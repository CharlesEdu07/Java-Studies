package br.com.charlesedu.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private Integer id;
    private String name;
    private Instructor instructor;
    private Set<Student> students = new HashSet<>();

    public Course(Integer id, String name, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setNamme(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course id: ");
        sb.append(id);
        sb.append("\nCourse name: ");
        sb.append(name);
        sb.append("\nCourse instructor: ");
        sb.append(instructor);
        sb.append("\n");
        return sb.toString();
    }
}
