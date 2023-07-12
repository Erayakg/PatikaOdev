package controller;

import entities.Content;
import entities.Course;
import entities.Student;

import java.util.List;

public class StudentController {
    private List<Student> students;
    private List<Course> courses;

    public StudentController(List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }




    public void enrollCourse(String studentUsername, Course course) {
        // Ders kaydı işlemi
    }

    public void rateContent(String studentUsername, Content content, int rating) {
        // İçeriği değerlendirme işlemi
    }

    public void addCommentToContent(String studentUsername, Content content, String comment) {
        // Yorum ekleme işlemi
    }

    public void solveQuiz(String studentUsername, Content content, List<Integer> selectedOptions) {
        // Quiz çözme işlemi
    }
}

