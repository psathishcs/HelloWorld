package org.hello.coding;

public class Factorial {
    public static  void  main(String[] args){
        int number = 5;
        System.out.println(factorial(number));
    }

    public static long factorial(int number){
        if (number == 0){
            return  1;
        }
        return number * factorial(number -1);
    }
}
