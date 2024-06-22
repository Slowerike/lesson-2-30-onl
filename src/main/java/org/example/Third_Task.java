package org.example;

public class Third_Task {
    public static void main(String[] args) {
        int num = 126742;
        boolean flag = true;
        while (num != 0) {
            int res1 = num % 10;
            num /= 10;
            int res2 = num;
            //циклом проходи по цифрам и сраниваем ,есть ли дубликат , если есть меняем флаг на false
            while (res2 != 0) {
                if (res1 == res2 % 10) {
                    flag = false;
                    break;
                }
                res2 /= 10;
            }
        }
        System.out.println(flag);
    }
}
