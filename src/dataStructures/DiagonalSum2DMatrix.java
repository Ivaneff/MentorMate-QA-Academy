package dataStructures;

public class DiagonalSum2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 12}, {10, 11, 3, 4}, {0, 15, 5, 10}, {13, 25, 60, 43}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == matrix[i].length - i - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum of the elements in both diagonals is: " + sum);
    }
}
