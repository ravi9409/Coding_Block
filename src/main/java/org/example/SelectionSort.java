package org.example;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={88,66,55,44,22};
        int[] barray=selectionSort(arr);
        for (int c:barray
             ) {
            System.out.println(c);
        }
    }
    public static int[] selectionSort(int[] a){
        for (int count=0;count<a.length-1;count++) {
            int min=count;
            for (int j=count+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int temp=a[min];
            a[min]=a[count];
            a[count]=temp;
        }
        return a;
    }
}