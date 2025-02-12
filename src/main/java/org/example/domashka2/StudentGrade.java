package org.example.domashka2;

public class StudentGrade {
    public StudentGrade(String studentName, String school, String subject, double score) {
        this.studentName = studentName;
        this.school = school;
        this.subject = subject;
        this.score = score;
    }

    /**
     * Name of the student.
     */
    String studentName;

    /**
     * The name of the school the student attends.
     */
    String school;

    /**
     * Name of the subject.
     */
    String subject;

    /**
     * Score obtained in the subject.
     */
    double score;

    public String getStudentName() {
        return studentName;
    }

    public String getSchool() {
        return school;
    }

    public String getSubject() {
        return subject;
    }

    public double getScore() {
        return score;
    }
}
