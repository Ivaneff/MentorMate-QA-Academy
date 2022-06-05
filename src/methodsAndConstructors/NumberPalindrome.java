package methodsAndConstructors;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a number: ");
        String number = sc.nextLine();
        System.out.println("The number is palindrome? - " + isPalindrome(number));
    }

    private static Boolean isPalindrome(String number) {
        if (number.length() == 1) {
            return true;
        }
        if (number.length() % 2 == 0) {
            String firstHalf = number.substring(0, number.length() / 2 - 1);
            String secondHalf = number.substring(number.length() / 2, number.length() - 1);
            String reversedSecondHalf = "";
            for (int i = secondHalf.length() - 1; i >= 0; i--) {
                reversedSecondHalf += secondHalf.charAt(i);
            }
            if (firstHalf.equalsIgnoreCase(reversedSecondHalf)) {
                return true;
            }
        } else {
            int evenHalf = number.length() / 2;
            String firstHalf = number.substring(0, evenHalf);
            String secondHalf = number.substring(evenHalf + 1, number.length());
            String reversedSecondHalf = "";
            for (int i = secondHalf.length() - 1; i >= 0; i--) {
                reversedSecondHalf += secondHalf.charAt(i);
            }
            return firstHalf.equalsIgnoreCase(reversedSecondHalf);
        }
        return true;
    }
}
