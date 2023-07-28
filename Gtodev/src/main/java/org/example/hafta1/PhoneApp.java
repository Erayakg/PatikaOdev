package org.example.hafta1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneApp {
    SmartPhone smartPhone =new SmartPhone("111111",5,8,50.0,1L,1000.0,"iphone");
    SmartPhone smartPhone1 =new SmartPhone("222222",6,8,1.0,2L,2000.0,"samsung");
    SmartPhone smartPhone2 =new SmartPhone("33333",9,8,20.0,3L,3000.0,"xamio");
    SmartPhone smartPhone3 =new SmartPhone("444444",6,8,50.0,4L,400.0,"oppo");
    SmartPhone smartPhone4 =new SmartPhone("555555",2,8,30.0,5L,250.0,"realme");
    List<SmartPhone> smartPhones =new ArrayList<>();
    public PhoneApp() {

        smartPhones.add(smartPhone);
        smartPhones.add(smartPhone1);
        smartPhones.add(smartPhone2);
        smartPhones.add(smartPhone3);
        smartPhones.add(smartPhone4);

        Double price = calculateTotalPrice(smartPhones);
        System.out.println("Toplam fiyat:" + price);
    }
    public Double calculateTotalPrice(List<SmartPhone> smartPhoneList){
        Double totalPrice=0.0;
        for (SmartPhone smartPhone:smartPhoneList){
            totalPrice+=smartPhone.getPrice();
        }
        return totalPrice;
    }
}
