package entities;

import java.util.List;
import java.util.Objects;

public class Student {
    private String username;
    private String password;
    private List<Course> enrolledCourses;

    public Student(String username, String password, List<Course> enrolledCourses) {
        this.username = username;
        this.password = password;
        this.enrolledCourses = enrolledCourses;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(username, student.username) && Objects.equals(password, student.password) && Objects.equals(enrolledCourses, student.enrolledCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, enrolledCourses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
