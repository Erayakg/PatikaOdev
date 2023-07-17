package org.example;

import java.util.List;

public class NumberChecker implements Runnable {
    private final List<Integer> numbers;
    private final List<Integer> evenNumbers;
    private final List<Integer> oddNumbers;

    public NumberChecker(List<Integer> numbers, List<Integer> evenNumbers, List<Integer> oddNumbers) {
        this.numbers = numbers;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
    }
}
