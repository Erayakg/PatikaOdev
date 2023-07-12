package entities;

import java.util.List;
import java.util.Objects;

public class Content {
    private int id;
    private String title;
    private String description;
    private String youtubeLink;
    private List<QuizQuestion> quizQuestions;
    private Course course;


    public Content(int id, String title, String description, String youtubeLink,  Course course) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.youtubeLink = youtubeLink;
        this.course = course;
    }

    public Content() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public List<QuizQuestion> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(List<QuizQuestion> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return Objects.equals(title, content.title) && Objects.equals(description, content.description) && Objects.equals(youtubeLink, content.youtubeLink) && Objects.equals(quizQuestions, content.quizQuestions) && Objects.equals(course, content.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, youtubeLink, quizQuestions, course);
    }

    @Override
    public String toString() {
        return "Content{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", youtubeLink='" + youtubeLink + '\'' +
                ", quizQuestions=" + quizQuestions +
                ", course=" + course +
                '}';
    }

}
