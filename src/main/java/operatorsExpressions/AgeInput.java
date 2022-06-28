package operatorsExpressions;

import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>0&& age<=80){
            if(age<16){
                System.out.println("You're not eligible to work");
            }else {
                System.out.println("You're eligible to work");
            }
        }else{
            System.out.println("Please enter a valid age (1-80)");
        }
    }
}
