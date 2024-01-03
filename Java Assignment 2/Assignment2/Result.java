package Assignment2;

import java.time.LocalDate;
import java.util.*;


public class Result {
    private int resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private int score;
    private String feedback;
    private LocalDate submissionDate;

    public Result(int resultId, Student student, Assignment assignment, Trainer trainer, int score, String feedback, LocalDate submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    public int getResultId() {
        return resultId;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public int getScore() {
        return score;
    }

    public String getFeedback() {
        return feedback;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", student=" + student.getName() +
                ", assignment=" + assignment.getTitle() +
                ", trainer=" + trainer.getName() +
                ", score=" + score +
                ", feedback='" + feedback + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, student, assignment, trainer, score, feedback, submissionDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Result result = (Result) obj;
        return resultId == result.resultId &&
                score == result.score &&
                Objects.equals(student, result.student) &&
                Objects.equals(assignment, result.assignment) &&
                Objects.equals(trainer, result.trainer) &&
                Objects.equals(feedback, result.feedback) &&
                Objects.equals(submissionDate, result.submissionDate);
    }
}

