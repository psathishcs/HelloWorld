package org.hello.coding;

public class NumberReverse {
    public static void main(String[] args){
        int number = 123456;
        int reverse = 0;
        while (number != 0){
            reverse = (reverse * 10) + (number%10);
            number = number /10;
        }
        System.out.println(reverse);
    }
}
