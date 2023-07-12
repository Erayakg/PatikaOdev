package entities;

import java.util.List;
import java.util.Objects;

public class Instructor {
    private String username;
    private String password;
    private List<Course> assignedCourses;

    public Instructor() {
    }

    public Instructor(String username, String password) {
        this.username = username;
        this.password = password;
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

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(assignedCourses, that.assignedCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, assignedCourses);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", assignedCourses=" + assignedCourses +
                '}';
    }
}
