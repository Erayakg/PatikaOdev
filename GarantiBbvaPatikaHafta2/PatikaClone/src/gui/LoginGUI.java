package gui;

import controller.OperatorController;
import gui.InstructorPanelGUI;

import gui.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JButton studentButton;
    private JButton instructorButton;
    private JButton operatorButton;

    public LoginGUI() {
        setTitle("Giriş Ekranı");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        studentButton = new JButton("Öğrenci Girişi");
        instructorButton = new JButton("Eğitmen Girişi");
        operatorButton = new JButton("Operatör Girişi");

        panel.add(studentButton);
        panel.add(instructorButton);
        panel.add(operatorButton);

        add(panel);

        // Kullanıcı türüne göre ilgili paneli açan ActionListener'lar eklenir
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentPanelGUI studentPanel=new StudentPanelGUI();
                studentPanel.setVisible(true);
                dispose();
            }
        });

        instructorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InstructorPanelGUI instructorPanel = new InstructorPanelGUI();
                instructorPanel.setVisible(true);
                dispose();
            }
        });

        operatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperatorPanelGUI operatorPanel = new OperatorPanelGUI();
                operatorPanel.setVisible(true);
                dispose();
            }
        });
    }
}
