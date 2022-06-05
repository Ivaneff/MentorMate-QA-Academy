package methodsAndConstructors;

import java.util.Scanner;

public class MiddleCharacterOfString {
    public static void main(String[] args) {
        String word;
        System.out.println("Please type a word: ");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        showMiddleCharacter(word);
    }

    private static void showMiddleCharacter(String word) {
        System.out.print("Middle character: ");
        if (word.length() % 2 == 0) {
            System.out.print(word.charAt((word.length() / 2) - 1) + ", ");
            System.out.println(word.charAt((word.length() / 2)));
        } else {
            System.out.println(word.charAt((word.length() % 2) + 1));
        }
    }
}
