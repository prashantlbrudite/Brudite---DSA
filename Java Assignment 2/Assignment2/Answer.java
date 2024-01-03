package Assignment2;

import java.util.Objects;

public class Answer {
    private int answerId;
    private String text;


    public Answer(int answerId, String text) {
        this.answerId = answerId;
        this.text = text;

    }

    public int getAnswerId() {
        return answerId;
    }

    public String getText() {
        return text;
    }


    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setText(String text) {
        this.text = text;
    }


     @Override
    public int hashCode() {
        return Objects.hash(answerId, text);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Answer answer = (Answer) obj;
        return answerId == answer.answerId &&
                Objects.equals(text, answer.text);
    }
}
