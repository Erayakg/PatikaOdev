package entities;

import java.util.Objects;

public class Operator {
    private String username;
    private String password;

    public Operator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Operator() {
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

    @Override
    public String toString() {
        return "Operator{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return Objects.equals(username, operator.username) && Objects.equals(password, operator.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
