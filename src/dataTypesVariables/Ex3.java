package dataTypesVariables;

import java.util.Scanner;

public class Ex3 {
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

        System.out.println("The area of the triangle is: " + calculateTriangleArea(sideA, sideB, sideC) + "cm.");
    }

    static double calculateTriangleArea(int a, int b, int c) {
        double result = 0;
        double s = (a + b + c) / 2.0;
        result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return result;
    }
}
