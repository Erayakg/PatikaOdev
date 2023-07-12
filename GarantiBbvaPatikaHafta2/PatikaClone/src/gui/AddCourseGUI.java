package gui;

import controller.OperatorController;
import entities.Course;

import javax.swing.*;
import java.awt.*;

public class AddCourseGUI extends JFrame {
    private JTextField courseTitleField;
    private JTextArea courseDescriptionArea;
    private JButton addCourseButton;
    private OperatorController operatorController;

    public AddCourseGUI(OperatorController operatorController) {
        this.operatorController = operatorController;

        setTitle("Kurs Ekle");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        courseTitleField = new JTextField();
        courseDescriptionArea = new JTextArea();
        addCourseButton = new JButton("Kurs Ekle");

        panel.add(new JLabel("Kurs Başlığı: "));
        panel.add(courseTitleField);
        panel.add(new JLabel("Kurs Açıklaması: "));
        panel.add(courseDescriptionArea);
        panel.add(addCourseButton);

        addCourseButton.addActionListener(e -> {
            String title = courseTitleField.getText();
            String description = courseDescriptionArea.getText();
            Course course = new Course(title, description);
            operatorController.addCourse(course);
        });

        add(panel);
    }
}
