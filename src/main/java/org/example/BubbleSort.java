package org.example;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={88,66,55,44,22};
        int[] barray=bubbleSort(arr);
        for (int c:barray
             ) {
            System.out.println(c);
        }
    }
    public static int[] bubbleSort(int[] a){
        int temp=0;
        for (int count=0;count<a.length-1;count++) {
            for (int j = 0; j < a.length - 1 - count; j++) {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}