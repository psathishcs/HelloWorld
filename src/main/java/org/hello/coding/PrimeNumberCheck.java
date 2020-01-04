package org.hello.coding;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("23 : " + isPrimeNumber(23));
        System.out.println("24 : " + isPrimeNumber(24));
        System.out.println("2 : " + isPrimeNumber(2));
        System.out.println("1 : " + isPrimeNumber(1));
        System.out.println("0 : " + isPrimeNumber(0));
        System.out.println("3 : " + isPrimeNumber(3));
        System.out.println("4 : " + isPrimeNumber(4));
        System.out.println("21 : " + isPrimeNumber(21));
    }
    public  static boolean isPrimeNumber(int num){

        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                return  false;
            }
        }
        return  true;
    }
}
