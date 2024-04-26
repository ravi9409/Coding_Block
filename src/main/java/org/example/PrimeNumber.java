package org.example;

public class PrimeNumber {
    public static void main(String[] args) {

        int a = 57;
        System.out.println(primeornot(a));

    }

    public static String primeornot(int num) {
        boolean bool = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                bool = true;
        }

        if (bool == true) {
            return "Number is not prime";
        } else {
            return "Number is prime";
        }
    }

}