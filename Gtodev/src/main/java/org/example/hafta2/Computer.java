package org.example.hafta2;

public class Computer extends Device {
    @Override
    void addController(GameController controller) {
        if (controller.Gettype().equals("XBOX") || controller.Gettype().equals("Playstation"))
            this.controller = controller;
        else
            System.out.println("Bilgisayar sadece XBOX veya Playstation kontrolörünü kabul eder.");
    }
}
