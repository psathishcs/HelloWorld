package org.hello.coding;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 25;
        int binary[] = new int[100];
        int index = 0;
        while (number > 0){
            binary[index++] = number % 2;
            number /= 2;
        }
        for (int i = index-1 ; i >= 0; i-- ){
            System.out.print(binary[i]);
        }

    }
}
