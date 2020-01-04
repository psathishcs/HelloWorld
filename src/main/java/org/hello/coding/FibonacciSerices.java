package org.hello.coding;

import java.util.Scanner;

public class FibonacciSerices {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a integer to generate FibonacciSerices : ");
        int number = scanner.nextInt();
        for (int i = 1;  i <= number; i++){
            System.out.print(fibonacci1(i) + " ");
        }
    }
    static int fibonacci(int i){
        if (i == 1 || i == 2){
            return 1;
        }
        return fibonacci(i-1) + fibonacci(i -2);
    }
    static int fibonacci1(int number){
        if (number == 1 || number == 2){
            return 1;
        }
        int fib1 = 1, fib2  = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++){
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }
}
