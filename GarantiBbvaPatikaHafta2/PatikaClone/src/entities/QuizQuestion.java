package entities;

import java.util.List;
import java.util.Objects;

public class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctOptionIndex;

    public QuizQuestion(String question, List<String> options, int correctOptionIndex) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public QuizQuestion() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "question='" + question + '\'' +
                ", options=" + options +
                ", correctOptionIndex=" + correctOptionIndex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuizQuestion that = (QuizQuestion) o;
        return correctOptionIndex == that.correctOptionIndex && Objects.equals(question, that.question) && Objects.equals(options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, options, correctOptionIndex);
    }
}
