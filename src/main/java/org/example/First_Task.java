package org.example;

public class First_Task {
    public static void main(String[] args) {
        long chaoticNumeric=12345678910L;
        int finalNum=0;
        while(chaoticNumeric!=0){
            long local=chaoticNumeric;
            int mulytplay=1;
            long local2=0;
            local/=10;
            //множитель
            while(local!=0){
                local/=10;
                mulytplay*=10;
            }
            local2=chaoticNumeric%10;
            finalNum+=mulytplay*local2;

            chaoticNumeric=chaoticNumeric/10;
        }
        System.out.println(finalNum);

    }
}