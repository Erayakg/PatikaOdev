package controller;

import dao.CourseDAO;
import entities.Content;
import entities.Course;
import entities.Operator;
import entities.QuizQuestion;
import gui.OperatorPanelGUI;

import java.util.List;

public class OperatorController {
    private List<Operator> operators;
    private List<Course> courses;
    private List<Content> contents;

    public OperatorController(List<Operator> operators, List<Course> courses, List<Content> contents) {
        this.operators = operators;
        this.courses = courses;
        this.contents = contents;
    }

    public OperatorController() {
    }

    public void addCourse(Course course) {
        CourseDAO courseDAO = new CourseDAO();
        courseDAO.addCourse(course);

    }

    public void updateCourse(Course course) {
    CourseDAO courseDAO=new CourseDAO();
    courseDAO.updateCourse(course);
    }

    public void deleteCourse(Course course) {
        CourseDAO courseDAO=new CourseDAO();
        courseDAO.deleteCourse(course);
    }

    public void updateContentOfCourse(Course course, Content content) {
        // İçerik güncelleme işlemi
    }

    public void deleteContentFromCourse(Course course, Content content) {
        // İçerik silme işlemi
    }

    public void addQuizQuestionToContent(Content content, QuizQuestion question) {
        // Quiz sorusu ekleme işlemi
    }

    public void updateQuizQuestionOfContent(Content content, QuizQuestion question) {
        // Quiz sorusu güncelleme işlemi
    }

    public void deleteQuizQuestionFromContent(Content content, QuizQuestion question) {
        // Quiz sorusu silme işlemi
    }
}
