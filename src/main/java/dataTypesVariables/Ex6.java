package dataTypesVariables;

import java.util.Scanner;

public class Ex6 {
    // Doesn't work !!!
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a:");
        a = sc.nextInt();
        System.out.println("Enter value for b:");
        b = sc.nextInt();
        System.out.println("Enter value for c:");
        c = sc.nextInt();

        System.out.println("The value of X is: " + calculateQuadraticEquation(a, b, c));
    }

    static double calculateQuadraticEquation(double a, double b, double c) {
        double result;
        double discriminant = b*b-4*a*c;
        if(discriminant>=0) {
            result = (-b + Math.sqrt(discriminant)) / 2 * a;
            return result;
        }
        else{
            return 0 ;
        }
    }
}
