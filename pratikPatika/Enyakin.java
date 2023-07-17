package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




                int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};
                int targetNumber=0;
                Scanner scanner= new Scanner(System.in);
                scanner.nextInt(targetNumber);
                int closestSmaller = Integer.MIN_VALUE;
                int closestLarger = Integer.MAX_VALUE;

                for (int i : numbers) {
                    if (i < targetNumber && i > closestSmaller) {
                        closestSmaller = i;
                    }
                    if (i > targetNumber && i < closestLarger) {
                        closestLarger = i;
                    }
                }

                System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);


    }
}