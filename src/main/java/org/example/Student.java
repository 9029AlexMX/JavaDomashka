package org.example;

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
}
