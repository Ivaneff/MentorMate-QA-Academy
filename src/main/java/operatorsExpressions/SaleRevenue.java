package operatorsExpressions;

import java.util.Scanner;

public class SaleRevenue {
    public static void main(String[] args) {
        System.out.println("Enter unit price: ");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        double discount15 = 0.15;
        double discount20 = 0.20;
        double discount=0;

        if(quantity>=100 && quantity<=120){
            discount=discount15;
        } else if (quantity>120) {
            discount=discount20;
        }

        double revenue;
        if(discount>0){
            revenue=(quantity*price)*(1-discount);
        }else {
            revenue=quantity*price;
        }
        double totalDiscount=quantity*price-(quantity*price)*(1-discount);

        System.out.println("The revenue from the sale: " + revenue+"$");
        System.out.println("Discount: "+totalDiscount+"$ ("+discount*100+"%)");
    }
}

