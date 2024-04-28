package org.example;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101010));
    }

    public static int binaryToDecimal(int a){
        int num=0;
        int bin=1;
        int count=0;
        while (a!=0){
            bin=a%10;
            num= (int) (num+Math.pow(2,count++)*bin);
            a=a/10;
        }
        return num;
    }
}