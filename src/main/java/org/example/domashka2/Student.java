package org.example.domashka2;

import java.util.List;

public class Student {
    /**
     * Name of the student.
     */
    private String name;

    /**
     * Age of the student.
     */
    private int age;

    /**
     * List of Grade objects, each representing the score in a subject.
     */
    private List<Grade> grades = List.of();

    /**
     * The name of the school the student attends.
     */
    private String school;

    /**
     * Information about the student’s address.
     */
    private Address address;

    /**
     * Returns name of the student.
     *
     * @return Name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of the student.
     *
     * @param name Name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns age of the student.
     *
     * @return Age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age of the student.
     *
     * @param age Age of the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns list of Grade objects, each representing the score in a subject.
     *
     * @return List of Grade objects, each representing the score in a subject.
     */
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Sets list of Grade objects, each representing the score in a subject.
     *
     * @param grades List of Grade objects, each representing the score in a subject.
     */
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    /**
     * Returns name of the school the student attends.
     *
     * @return The name of the school the student attends.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets name of the school the student attends.
     *
     * @param school The name of the school the student attends.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Returns information about the student’s address.
     *
     * @return Information about the student’s address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets information about the student’s address.
     *
     * @param address Information about the student’s address.
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
