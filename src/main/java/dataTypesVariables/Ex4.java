package dataTypesVariables;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String asterix = "*";
        String space = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the tree");
        int size = sc.nextInt();
        ArrayList<String> listAsterix = new ArrayList<>();
        ArrayList<String> listSpace = new ArrayList<>(size);
        for (int i = 0; i < size ; i++) {
            listSpace.add(space);
        }
        for (int i = 1; i <= size*2; i++) {
            listAsterix.add(asterix);
            if (i < size*2 & i % 2 != 0) {
                printList(listSpace);
                printList(listAsterix);
                listSpace.remove(space);
                System.out.println();
            }
        }
    }
    static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element);
        }
    }
}
