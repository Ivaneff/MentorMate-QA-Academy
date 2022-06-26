package methodsAndConstructors;

import java.util.Scanner;

public class isEvenMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int number = sc.nextInt();
        System.out.println(isEven(number));
    }

    private static Boolean isEven(int number) {
        return number % 2 == 0;
    }
}
