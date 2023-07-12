package dao;

import entities.Instructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstructorDAO {
    private Connection connection;

    public InstructorDAO() {
        try {
            // Veritabanı bağlantısını kur
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/patikadeneme", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addInstructor(Instructor instructor) {
        try {
            String query = "INSERT INTO instructors (username, password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, instructor.getUsername());
            statement.setString(2, instructor.getPassword());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateInstructor(Instructor instructor) {
        try {
            String query = "UPDATE instructors SET password = ? WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, instructor.getPassword());
            statement.setString(2, instructor.getUsername());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteInstructor(Instructor instructor) {
        try {
            String query = "DELETE FROM instructors WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, instructor.getUsername());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Instructor> getAllInstructors() {
        List<Instructor> instructors = new ArrayList<>();
        try {
            String query = "SELECT * FROM instructors";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                Instructor instructor = new Instructor(username, password);
                instructors.add(instructor);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instructors;
    }

    public Instructor getInstructorByUsername(String username) {
        try {
            String query = "SELECT * FROM instructors WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String password = resultSet.getString("password");
                Instructor instructor = new Instructor(username, password);
                resultSet.close();
                statement.close();
                return instructor;
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
