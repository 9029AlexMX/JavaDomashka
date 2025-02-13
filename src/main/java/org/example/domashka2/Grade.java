package org.example.domashka2;

public class Grade {
    /**
     * Name of the subject.
     */
    private String subject;

    /**
     * Score obtained in the subject.
     */
    private double score;

    /**
     * Constructor.
     *
     * @param subject Name of the subject.
     * @param score Score obtained in the subject.
     */
    public Grade(final String subject, final double score) {
        this.subject = subject;
        this.score = score;
    }

    /**
     * Returns score obtained in the subject.
     *
     * @return Score obtained in the subject.
     */
    public double getScore() {
        return score;
    }

    /**
     * Returns name of the subject.
     *
     * @return Name of the subject.
     */
    public String getSubject() {
        return subject;
    }
}
