package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


                int[] numbers = {1, 2, 3, 4, 4,1};

                Map<Integer, Integer> countMap = new HashMap<>();
                List<Integer> repeatedPairs = new ArrayList<>();

                for (int number : numbers) {
                    if (number % 2 == 0) {
                        countMap.put(number, countMap.getOrDefault(number, 0) + 1);
                    }
                }

                for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                    int number = entry.getKey();
                    int count = entry.getValue();
                    if (count >= 2) {
                        repeatedPairs.add(number);
                    }
                }

                System.out.println("Tekrar eden çift sayılar:");
                for (int number : repeatedPairs) {
                    System.out.println(number);
                }




    }
}