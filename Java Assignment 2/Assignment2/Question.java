package Assignment2;

import java.util.*;

public class Question {
    private int questionId;
    private Answer answers;
    private String[] answerKey;
    private int score;
    private int techStackId;
    private int assignmentId;

    public Question(int questionId, Answer answers, String[] answerKey, int score, int techStackId, int assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.score = score;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public Answer getAnswers() {
        return answers;
    }

    public String[] getAnswerKey() {
        return answerKey;
    }

    public int getScore() {
        return score;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswers(Answer answers) {
        this.answers = answers;
    }

    public void setAnswerKey(String[] answerKey) {
        this.answerKey = answerKey;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

     @Override
    public int hashCode() {
        return Objects.hash(questionId, answers, answerKey, score, techStackId, assignmentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Question question = (Question) obj;
        return questionId == question.questionId &&
                score == question.score &&
                techStackId == question.techStackId &&
                assignmentId == question.assignmentId &&
                Objects.equals(answers, question.answers) &&
                Objects.equals(answerKey, question.answerKey);
    }
}

