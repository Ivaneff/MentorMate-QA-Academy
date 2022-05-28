package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word to be checked: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder testWord = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            testWord.append(stack.pop());
        }
        if (testWord.toString().equalsIgnoreCase(word)) {
            System.out.println("Yes!!! You have a palindrome!");
        }else {
            System.out.println("Nope...Not a palindrome.");
        }
    }
}
