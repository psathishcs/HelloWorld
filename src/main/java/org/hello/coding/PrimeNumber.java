package org.hello.coding;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        while (number != 0){
            number = scanner.nextInt();
            System.out.println(number + " is prime " + isPrimeNumber(number));
        }

    }
    public static boolean isPrimeNumber(int number){
        if (number == 2 || number == 3) {
            return  true;
        }
        if (number % 2 == 0){
            return  false;
        }
        int sqrt  = (int) Math.sqrt(number);
        for (int i = 3;  i < sqrt; i +=2) {
            if (number % i == 0){
                return  false;
            }
        }
        return   true;
    }
}
