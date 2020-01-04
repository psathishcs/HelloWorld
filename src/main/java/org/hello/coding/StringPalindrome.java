package org.hello.coding;

public class StringPalindrome {
    public static void main(String[] args){
        String text = "Strtsa";
        System.out.println(isPalindrome(text));
        System.out.println(isPalindromeStringBuilder(text));

    }
    public static boolean isPalindrome(String text){
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int lenght = cleanText.length();
        int forward = 0;
        int backward = lenght -1;
        while (backward > forward){
            char forwardChar = cleanText.charAt(forward++);
            char backwardChar = cleanText.charAt(backward--);
            if (backwardChar != forwardChar){
                return  false;
            }
        }
        return  true;
    }
    public static boolean isPalindromeStringBuilder(String text){
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(cleanText);
        StringBuilder reverse = plain.reverse();
        return reverse.toString().equals(cleanText);
    }
}
