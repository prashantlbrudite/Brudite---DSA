package Assignment2;

import java.time.LocalDate;
import java.util.*;

public class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private LocalDate dueDate;
    private List<Question> Questions;

    public Assignment(int assignmentId, String title, String description, LocalDate dueDate, List<Question> Questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.Questions = Questions;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public List<Question> getStrings() {
        return Questions;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStrings(List<Question> Questions) {
        this.Questions = Questions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, title, description, dueDate, Questions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Assignment assignment = (Assignment) obj;
        return assignmentId == assignment.assignmentId &&
                Objects.equals(title, assignment.title) &&
                Objects.equals(description, assignment.description) &&
                Objects.equals(dueDate, assignment.dueDate) &&
                Objects.equals(Questions, assignment.Questions);
    }
}

