package org.hello.coding;

public class IntegerPalindrome {
    public static void main(String[] args){
        int number = 123;
        System.out.println(isPalindrome(number));

    }
    public static boolean isPalindrome(int number){
        int reversedNumber = 0, orginalNumber, reminder;
        orginalNumber = number;
        while (number != 0){
            reminder = number % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            number /= 10;
        }
        if (orginalNumber == reversedNumber){
            return true;
        } else {
            return false;
        }
    }
}
