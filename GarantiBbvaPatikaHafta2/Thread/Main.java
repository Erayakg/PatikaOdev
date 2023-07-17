package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main{

    public static void main(String []args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
        List<Integer> part1 = new ArrayList<>(numbers.subList(0, 2500));
        List<Integer> part2 = new ArrayList<>(numbers.subList(2500, 5000));
        List<Integer> part3 = new ArrayList<>(numbers.subList(5000, 7500));
        List<Integer> part4 = new ArrayList<>(numbers.subList(7500, 10000));

        CopyOnWriteArrayList<Integer> evenNumbers = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Integer> oddNumbers = new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(new NumberChecker(part1, evenNumbers, oddNumbers));
        Thread t2 = new Thread(new NumberChecker(part2, evenNumbers, oddNumbers));
        Thread t3 = new Thread(new NumberChecker(part3, evenNumbers, oddNumbers));
        Thread t4 = new Thread(new NumberChecker(part4, evenNumbers, oddNumbers));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

    }
}