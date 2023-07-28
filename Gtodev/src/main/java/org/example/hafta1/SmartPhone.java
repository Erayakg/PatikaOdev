package org.example.hafta1;

public class SmartPhone extends Product{

    private String phoneNumber;
    private int storage;
    private int ram;
    private Double camera;

    public SmartPhone() {
    }

    public SmartPhone(String phoneNumber, int storage, int ram, Double camera,Long id,Double price,String name) {
        super(id,name,price);
        this.phoneNumber = phoneNumber;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Double getCamera() {
        return camera;
    }

    public void setCamera(Double camera) {
        this.camera = camera;
    }
}
