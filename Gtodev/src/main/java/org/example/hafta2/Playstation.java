package org.example.hafta2;

public class Playstation extends Device{
    @Override
    void addController(GameController controller) {
        if(controller.Gettype().equals("Playstation"))
            this.controller = controller;
        else
            System.out.println("Playstation sadece Playstation kontrolörünü kabul eder.");
    }
}
