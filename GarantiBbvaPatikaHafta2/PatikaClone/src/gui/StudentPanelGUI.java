package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPanelGUI extends JFrame {
    private JButton enrollButton;
    private JButton viewContentButton;
    private JButton rateContentButton;
    private JButton solveQuizButton;

    public StudentPanelGUI() {
        setTitle("Öğrenci Paneli");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        enrollButton = new JButton("Ders Kaydol");
        viewContentButton = new JButton("İçeriği Görüntüle");
        rateContentButton = new JButton("İçeriği Değerlendir");
        solveQuizButton = new JButton("Quiz Çöz");

        panel.add(enrollButton);
        panel.add(viewContentButton);
        panel.add(rateContentButton);
        panel.add(solveQuizButton);

        add(panel);

        // Öğrenci işlemleri için ActionListener'lar eklenir
        enrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ders kaydolma işlemi
            }
        });

        viewContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçeriği görüntüleme işlemi
            }
        });

        rateContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçeriği değerlendirme işlemi
            }
        });

        solveQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quiz çözme işlemi
            }
        });
    }
}
