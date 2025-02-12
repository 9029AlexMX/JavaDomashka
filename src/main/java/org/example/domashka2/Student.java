package org.example.domashka2;

import java.util.List;

public class Student {
    /**
     * Name of the student.
     */
    String name;

    /**
     * Age of the student.
     */
    int age;

    /**
     * List of Grade objects, each representing the score in a subject.
     */
    List<Grade> grades = List.of();

    /**
     * The name of the school the student attends.
     */
    String school;

    /**
     * Information about the student’s address.
     */
    Address address;

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

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
