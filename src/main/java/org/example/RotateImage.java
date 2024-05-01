package org.example;

public class RotateImage {
    //Rotate Image
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(a);
    }
    public static void rotate(int[][] matrix) {

        transpose(matrix);
        display(matrix);
    }

    public static void transpose(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void display(int[][] matrix) {

        for (int i = matrix.length-1; i >=0; i--) {
            for (int j = 0; j <matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}