package dataStructures;

import java.util.Scanner;

public class PrintUserInputMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows of the 2D matrix: ");
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        System.out.println("Enter the number of columns of the 2D matrix: ");
        int numColumns = sc.nextInt();
        int[][] matrix = new int[numRows][numColumns];
        System.out.println("Enter the elements of matrix one by one: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Next element: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
