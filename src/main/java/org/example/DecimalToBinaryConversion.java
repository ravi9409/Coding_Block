package org.example;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(15));
    }

    //Function to convert decimal to binary
    public static int decimalToBinary(int x) {
        int power = 1;
        int binary = 0;
        while (x != 0) {
            int rem = x % 2;
            binary = binary + (rem * power);
            power = power * 10;
            x = x / 2;
        }
        return binary;
    }
}