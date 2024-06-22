package org.example;

public class Fourth_Task {
    public static void main(String[] args) {
        long number = 2357234835678L;
        long result1=0;
        long numberForLastCycle = 0;
        while (number != 0) {
            long digit = number % 10;
            number /= 10;
            long nextDigit = number % 10;
            if (digit - 1 == nextDigit) {
                result1=digit+10*result1;
                numberForLastCycle = digit;
            } else {
                if (numberForLastCycle - 1 == digit) {
                    result1=digit+10*result1;
                }
            }
        }
        System.out.println(result1);
    }
}