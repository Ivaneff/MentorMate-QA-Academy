package methodsAndConstructors;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Please type some text: ");
        String text;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        countWords(text);
    }

    private static void countWords(String text) {
        String[] words = text.split(" ");
        System.out.println("There are " + words.length + " words in your text");
    }
}
