package org.example.hafta2;

abstract class Device {
    protected boolean status = false; // false means the device is off
    protected GameController controller;

    void open() throws Exception {
        if(status) throw new Exception("Cihaz zaten açık");
        else status = true;
    }

    void shutdown() throws Exception {
        if(!status) throw new Exception("Cihaz zaten kapalı");
        else status = false;
    }

    abstract void addController(GameController controller);

    void playGame() throws Exception {
        if(!status) throw new Exception("Cihaz kapalı");
        else System.out.println("Oyun başladı");
    }
}
