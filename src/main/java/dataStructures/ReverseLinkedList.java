package dataStructures;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Alpha");
        lList.add("Beta");
        lList.add("Gama");
        lList.add("Delta");
        LinkedList<String> rList = new LinkedList<>();
        for (int i = lList.size()-1; i >= 0 ; i--) {
            rList.add(lList.get(i));
        }
        System.out.println(rList);
    }
}
