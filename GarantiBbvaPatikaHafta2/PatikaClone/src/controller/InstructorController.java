package controller;

import entities.Content;
import entities.Course;
import entities.Instructor;
import entities.QuizQuestion;

import java.util.List;

public class InstructorController {
    private List<Instructor> instructors;
    private List<Course> courses;

    public InstructorController(List<Instructor> instructors, List<Course> courses) {
        this.instructors = instructors;
        this.courses = courses;
    }

    public void addContentToCourse(String instructorUsername, Course course, Content content) {
        // İçerik ekleme işlemi
    }

    public void updateContentOfCourse(String instructorUsername, Course course, Content content) {
        // İçerik güncelleme işlemi
    }

    public void deleteContentFromCourse(String instructorUsername, Course course, Content content) {
        // İçerik silme işlemi
    }

    public List<Content> listContentsOfCourse(String instructorUsername, Course course) {
        return  null;// İçerikleri listeleme işlemi
    }

    public void addQuizQuestionToContent(String instructorUsername, Content content, QuizQuestion question) {
        // Quiz sorusu ekleme işlemi
    }
}
