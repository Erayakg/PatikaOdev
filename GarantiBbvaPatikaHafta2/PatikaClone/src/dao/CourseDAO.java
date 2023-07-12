package dao;

import entities.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private Connection connection;

    public CourseDAO() {
        try {
            // Veritabanı bağlantısını kur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/patikadeneme", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCourse(Course course) {
        try {
            String query = "INSERT INTO courses (title, description) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, course.getTitle());
            statement.setString(2, course.getDescription());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCourse(Course course) {
        try {
            String query = "UPDATE courses SET title = ?, description = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, course.getTitle());
            statement.setString(2, course.getDescription());
            statement.setInt(3, course.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCourse(Course course) {
        try {
            String query = "DELETE FROM courses WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, course.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            String query = "SELECT * FROM courses";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                Course course = new Course(id, title, description);
                courses.add(course);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public Course getCourseById(int courseId) {
        try {
            String query = "SELECT * FROM courses WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, courseId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                Course course = new Course(courseId, title, description);
                resultSet.close();
                statement.close();
                return course;
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
