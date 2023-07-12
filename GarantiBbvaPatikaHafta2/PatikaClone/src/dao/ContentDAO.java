package dao;

import entities.Content;
import entities.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContentDAO {
    private Connection connection;

    public ContentDAO() {
        try {
            // Veritabanı bağlantısını kur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/patikadeneme", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addContent(Content content) {
        try {
            String query = "INSERT INTO contents (title, description, youtube_link, course_id) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, content.getTitle());
            statement.setString(2, content.getDescription());
            statement.setString(3, content.getYoutubeLink());
            statement.setInt(4, content.getCourse().getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateContent(Content content) {
        try {
            String query = "UPDATE contents SET title = ?, description = ?, youtube_link = ?, course_id = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, content.getTitle());
            statement.setString(2, content.getDescription());
            statement.setString(3, content.getYoutubeLink());
            statement.setInt(4, content.getCourse().getId());
            statement.setInt(5, content.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteContent(Content content) {
        try {
            String query = "DELETE FROM contents WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, content.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Content> getAllContents() {
        List<Content> contents = new ArrayList<>();
        try {
            String query = "SELECT * FROM contents";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String youtubeLink = resultSet.getString("youtube_link");
                int courseId = resultSet.getInt("course_id");

                // Dersi getirme işlemi
                CourseDAO courseDAO = new CourseDAO();
                Course course = courseDAO.getCourseById(courseId);

                Content content = new Content(id, title, description, youtubeLink, course);
                contents.add(content);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public List<Content> getContentsByCourse(Course course) {
        List<Content> contents = new ArrayList<>();
        try {
            String query = "SELECT * FROM contents WHERE course_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, course.getId());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String youtubeLink = resultSet.getString("youtube_link");

                Content content = new Content(id, title, description, youtubeLink, course);
                contents.add(content);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contents;
    }
}
