package dataStructures;

public class printElements2DMatrix {
    public static void main(String[] args) {
        int[][] doubleArr = {{3,5,8},{7,3,1},{8,3,12},{0,7,16}};
        for (int i = 0; i < doubleArr.length    ; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                System.out.print(doubleArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
