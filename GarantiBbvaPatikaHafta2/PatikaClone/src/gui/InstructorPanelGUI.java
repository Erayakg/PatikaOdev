package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructorPanelGUI extends JFrame {
    private JButton addContentButton;
    private JButton editContentButton;
    private JButton deleteContentButton;
    private JButton listContentButton;

    public InstructorPanelGUI() {
        setTitle("Eğitmen Paneli");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        addContentButton = new JButton("İçerik Ekle");
        editContentButton = new JButton("İçerik Düzenle");
        deleteContentButton = new JButton("İçerik Sil");
        listContentButton = new JButton("İçerikleri Listele");

        panel.add(addContentButton);
        panel.add(editContentButton);
        panel.add(deleteContentButton);
        panel.add(listContentButton);

        add(panel);

        // Eğitmen işlemleri için ActionListener'lar eklenir
        addContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçerik ekleme işlemi
            }
        });

        editContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçerik düzenleme işlemi
            }
        });

        deleteContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçerik silme işlemi
            }
        });

        listContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçerikleri listeleme işlemi
            }
        });
    }
}
