package operatorsExpressions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VacationAdviser {
    public static void main(String[] args) {
        //Beach, mountain, N persons, budget
        System.out.println("Hello, please type Beach or Mountain for your destination: ");
        Scanner sc = new Scanner(System.in);
        String desiredDestination = sc.next();
        int numberOfPersons;
        double budget;
        if(desiredDestination.equalsIgnoreCase("Beach")){
            desiredDestination = "Beach";
        } else if (desiredDestination.equalsIgnoreCase("Mountain")) {
            desiredDestination = "Mountain";
        }else {
            System.out.println("Incorrect input or no info about this type of vacation");
            return;
        }
        System.out.println("Please type the number of persons: ");
        numberOfPersons = sc.nextInt();
        System.out.println("Please type the amount of your budget for one person(per day): ");
        budget = sc.nextDouble()*numberOfPersons;

        if(desiredDestination.equals("Beach")&&budget<50){
            System.out.println("Destination - Black sea");
        } else if (desiredDestination.equals("Beach")&&budget>=50) {
            System.out.println("Destination - greek sea");
        }

        if(desiredDestination.equals("Mountain")&&budget<30){
            System.out.println("Destination - bulgarian mountains");
        } else if (desiredDestination.equals("Mountain")&&budget>=30) {
            System.out.println("Destination - mountains outside Bulgaria");
        }
    }
}
