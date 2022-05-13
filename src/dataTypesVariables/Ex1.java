package dataTypesVariables;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String firstName;
        String secondName;
        String lastName;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = sc.nextLine();
        System.out.println("Enter your second name:");
        secondName = sc.nextLine();
        System.out.println("Enter your last name:");
        lastName = sc.nextLine();

        System.out.println("Your full name is: "+firstName+" "+secondName+" "+lastName);
    }
}
