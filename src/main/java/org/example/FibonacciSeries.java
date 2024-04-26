package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int a : fibonacci(6)) {
            System.out.println(a);
        }
    }

    public static int[] fibonacci(int a) {
        int[] arr = new int[a + 1];
        int sum = 0;
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 0; i < a - 1; i++) {
            sum = arr[i] + arr[i + 1];
            arr[i + 2] = sum;
        }
        return arr;
    }
}