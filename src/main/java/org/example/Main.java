package org.example;

import org.example.domashka2.Address;
import org.example.domashka2.Grade;
import org.example.domashka2.Student;

import java.util.List;

public final class Main {
    private Main() {
    }

    /**
     * App main entry point.
     *
     * @param args Arguments.
     */
    public static void main(final String[] args) {
        Student studentAlice = new Student();
        studentAlice.setName("Alice");
        studentAlice.setAge(15);
        studentAlice.setSchool("New York School 1");
        studentAlice.setAddress(new Address(
        "New York",
        "Boulevard of Broken Dreams"
        ));
        studentAlice.setGrades(List.of(
            new Grade("mathematics", 70),
            new Grade("physics", 60),
            new Grade("english", 95),
            new Grade("sociology", 100),
            new Grade("history", 88),
            new Grade("biology", 81)
        ));

        Student studentJohn = new Student();
        studentJohn.setName("John");
        studentJohn.setAge(19);
        studentJohn.setSchool("Washington School 2");
        studentJohn.setAddress(new Address(
        "Washington",
        "South Park"
        ));
        studentJohn.setGrades(List.of(
            new Grade("mathematics", 60),
            new Grade("physics", 53),
            new Grade("english", 80),
            new Grade("sociology", 77),
            new Grade("history", 65),
            new Grade("biology", 55)
        ));

        Student studentGregg = new Student();
        studentGregg.setName("Gregg");
        studentGregg.setAge(16);
        studentGregg.setSchool("New York school 3");
        studentGregg.setAddress(new Address(
        "New York",
        "Garden Square"
        ));
        studentGregg.setGrades(List.of(
            new Grade("mathematics", 90),
            new Grade("physics", 86),
            new Grade("english", 87),
            new Grade("sociology", 65),
            new Grade("history", 90),
            new Grade("biology", 76)
        ));

        Student studentRebecca = new Student();
        studentRebecca.setName("Rebecca");
        studentRebecca.setAge(16);
        studentRebecca.setSchool("New York school 3");
        studentRebecca.setAddress(new Address(
        "New York",
        "Garden Square"
        ));
        studentRebecca.setGrades(List.of(
            new Grade("mathematics", 82),
            new Grade("physics", 71),
            new Grade("english", 93),
            new Grade("sociology", 90),
            new Grade("history", 84),
            new Grade("biology", 80)
        ));

        Student studentMichael = new Student();
        studentMichael.setName("Michael");
        studentMichael.setAge(14);
        studentMichael.setSchool("New York school 3");
        studentMichael.setAddress(new Address(
        "New York",
        "Garden Square"
        ));
        studentMichael.setGrades(List.of(
            new Grade("mathematics", 65),
            new Grade("physics", 71),
            new Grade("english", 90),
            new Grade("sociology", 81),
            new Grade("history", 84),
            new Grade("biology", 72)
        ));

        Student studentRachel = new Student();
        studentRachel.setName("Rachel");
        studentRachel.setAge(18);
        studentRachel.setSchool("Los Angeles school 5");
        studentRachel.setAddress(new Address(
        "Los Angeles",
        "Hollywood"
        ));
        studentRachel.setGrades(List.of(
            new Grade("mathematics", 63),
            new Grade("physics", 51),
            new Grade("english", 80),
            new Grade("sociology", 83),
            new Grade("history", 77),
            new Grade("biology", 61)
        ));

        Student studentStuart = new Student();
        studentStuart.setName("Stuart");
        studentStuart.setAge(20);
        studentStuart.setSchool("Atlanta school 1");
        studentStuart.setAddress(new Address(
        "Atlanta",
        "Main Street"
        ));
        studentStuart.setGrades(List.of(
            new Grade("mathematics", 95),
            new Grade("physics", 88),
            new Grade("english", 95),
            new Grade("sociology", 92),
            new Grade("history", 88),
            new Grade("biology", 72)
        ));

        Student studentShawn = new Student();
        studentShawn.setName("Shawn");
        studentShawn.setAge(20);
        studentShawn.setSchool("New York school 1");
        studentShawn.setAddress(new Address(
        "New York",
        "Main Street"
        ));
        studentShawn.setGrades(List.of(
                new Grade("mathematics", 84),
                new Grade("physics", 78),
                new Grade("english", 85),
                new Grade("sociology", 92),
                new Grade("history", 88),
                new Grade("biology", 66)
        ));

        List<Student> studentList = List.of(
            studentAlice,
            studentJohn,
            studentMichael,
            studentGregg,
            studentRachel,
            studentRebecca,
            studentStuart,
            studentShawn
        );
        studentList.stream()
            .filter(s -> s.getAge() > 15 && s.getAddress().getCity().equals("New York"))
            .map(Student::getName)
            .forEach(System.out::println);

        // System.out.println("Hello World !");
    }
}
