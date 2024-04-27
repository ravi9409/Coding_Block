package org.example;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] a={4,0,3,2,5,0,0};
        for (int a1:moveZeroToEnd(a)) {
            System.out.println(a1);
        }
    }

    public static int[] moveZeroToEnd(int[] a){
        int i=0;
        int j=i+1;
        int temp=0;
        for (;i<a.length;i++,j++) {
            if (a[i] == 0 && i<a.length-1) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }
}