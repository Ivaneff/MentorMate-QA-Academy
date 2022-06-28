package dataTypesVariables;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side A in cm:");
        sideA = sc.nextInt();
        System.out.println("Enter side B in cm:");
        sideB = sc.nextInt();
        System.out.println("Enter side C in cm:");
        sideC = sc.nextInt();

        System.out.println("The perimeter of the triangle is: "+(sideA+sideB+sideC) + "cm.");
    }
}
