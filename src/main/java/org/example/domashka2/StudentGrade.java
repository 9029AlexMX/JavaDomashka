package org.example.domashka2;

public class StudentGrade {
    /**
     * Constructor.
     *
     * @param studentName Name of the student.
     * @param school The name of the school the student attends.
     * @param subject Name of the subject.
     * @param score Score obtained in the subject.
     */
    public StudentGrade(
        String studentName,
        String school,
        String subject,
        double score
    ) {
        this.studentName = studentName;
        this.school = school;
        this.subject = subject;
        this.score = score;
    }

    /**
     * Name of the student.
     */
    private String studentName;

    /**
     * The name of the school the student attends.
     */
    private String school;

    /**
     * Name of the subject.
     */
    private String subject;

    /**
     * Score obtained in the subject.
     */
    private double score;

    /**
     * Returns name of the student.
     *
     * @return Name of the student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Returns the name of the school the student attends.
     *
     * @return The name of the school the student attends.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Returns name of the subject.
     *
     * @return Name of the subject.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Returns score obtained in the subject.
     *
     * @return Score obtained in the subject.
     */
    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "studentName='" + studentName + '\'' +
                ", school='" + school + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
