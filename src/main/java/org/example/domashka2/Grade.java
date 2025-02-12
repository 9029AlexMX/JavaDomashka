package org.example.domashka2;

public class Grade {
    /**
     * Name of the subject.
     */
    String subject;

    /**
     * Score obtained in the subject.
     */
    double score;

    public Grade(String subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getSubject() {
        return subject;
    }
}
