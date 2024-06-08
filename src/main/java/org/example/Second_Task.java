package org.example;

public class Second_Task {
    public static void main(String[] args) {
        int num = 238791;//наше число
        int min = 9;  // Инициализируем min как максимальное возможное значение цифры
        int max = 0;  // Инициализируем max как минимальное возможное значение цифры

        while (num != 0) {
            int digit = num % 10;

            if (digit > max) {
                max = digit;
            }

            if (digit < min) {
                min = digit;
            }

            num /= 10;
        }

        System.out.println("Минимальная цифра: " + min);
        System.out.println("Максимальная цифра: " + max);
    }
}
