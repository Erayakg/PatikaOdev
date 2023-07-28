package org.example.hafta2;

public class Xbox extends Device{
    @Override
    void addController(GameController controller) {
        if(controller.Gettype().equals("XBOX"))
            this.controller = controller;
        else
            System.out.println("XBOX sadece XBOX kontrolörünü kabul eder.");
    }
}
