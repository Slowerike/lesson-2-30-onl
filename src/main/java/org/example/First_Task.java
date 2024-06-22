package org.example;

public class First_Task {
    public static void main(String[] args) {
        long chaoticNumeric=123456789102L;
        long finalNum=0;
        while(chaoticNumeric!=0){
            long local=chaoticNumeric%10;
            finalNum=local+10*finalNum;
            chaoticNumeric/=10;
        }
        System.out.println(finalNum);

    }
}