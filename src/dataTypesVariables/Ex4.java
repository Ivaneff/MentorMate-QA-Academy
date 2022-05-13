package dataTypesVariables;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        String asterix = "*";
        String space = " ";
        int size = 21;
        ArrayList<String> listAsterix = new ArrayList<>();
        ArrayList<String> listSpace = new ArrayList<>(size / 2);
        for (int i = 0; i < size / 2; i++) {
            listSpace.add(space);
        }
        for (int i = 1; i <= size; i++) {
            listAsterix.add(asterix);
            if (i < size & i % 2 != 0) {
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
