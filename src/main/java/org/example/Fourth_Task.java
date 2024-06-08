package org.example;

public class Fourth_Task {
    public static void main(String[] args) {
        long number = 2357234835678L;
        String result = "";
        long numberForLastCycle = 0;
        while (number != 0) {
            long digit = number % 10;
            number /= 10;
            long nextDigit = number % 10;
            if (digit - 1 == nextDigit) {
                result += digit;
                numberForLastCycle = digit;
            } else {
                if (numberForLastCycle - 1 == digit) {
                    result += digit;
                }
            }
        }
        System.out.println(result);
    }
}