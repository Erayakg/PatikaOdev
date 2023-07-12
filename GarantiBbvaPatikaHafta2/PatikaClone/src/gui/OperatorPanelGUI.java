package gui;

import controller.OperatorController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorPanelGUI extends JFrame {
    private JButton deleteCourseButton;
    private JButton editCourseButton;
    private JButton addContentButton;
    private JButton editContentButton;

    public OperatorPanelGUI() {
        setTitle("Operatör Paneli");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        deleteCourseButton = new JButton("Ders Sil");
        editCourseButton = new JButton("Ders Düzenle");
        addContentButton = new JButton("İçerik Ekle");
        editContentButton = new JButton("İçerik Düzenle");

        panel.add(deleteCourseButton);
        panel.add(editCourseButton);
        panel.add(addContentButton);
        panel.add(editContentButton);

        add(panel);

        // Operatör işlemleri için ActionListener'lar eklenir
        deleteCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ders silme işlemi
            }
        });

        editCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ders düzenleme işlemi
            }
        });

        addContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperatorController operatorController=new OperatorController();
               AddCourseGUI gui=new AddCourseGUI(operatorController);
               gui.setVisible(true);

            }
        });

        editContentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // İçerik düzenleme işlemi
            }
        });
    }
}
