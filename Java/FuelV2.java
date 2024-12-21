/*
 *  Programmer:     Corey Jenkins
 *  Date:           March 24, 2024
 *  Filename:       fuelV2.java
 *  Purpose:        Using a combination of a switch and while loops for input validation to select
 *                  which type of fuel and how many gallons. It will then calculate the price by the amount.
 *                  of gallons inputted.
*/

import java.util.Scanner;

public class FuelV2 {
    public static void main(String[] args) {
        Scanner fuel = new Scanner(System.in);
        String regular = "Regular";
        String plus = "Plus";
        String supreme = "Supreme";

        double regularPrice = 3.99;
        double plusPrice = 4.99;
        double supremePrice = 5.99;

        int gallons;
        double total;

        int fuelSelect;

        System.out.println("Please select fuel type: ");
        System.out.println("1 - Regular");
        System.out.println("2 - Plus");
        System.out.println("3 - Supreme");
        fuelSelect = fuel.nextInt();
        while (fuelSelect <= 0 || fuelSelect > 3) {
            System.out.println("Error! Please select fuel type below. These are your options:");
            System.out.println("1 - Regular");
            System.out.println("2 - Plus");
            System.out.println("3 - Supreme");
            fuelSelect = fuel.nextInt();
        }

        switch (fuelSelect) {
            case 1:
                System.out.println("You have selected: " + regular + ".");
                System.out.println("Please enter gallons");
                gallons = fuel.nextDouble();
                while (gallons <= 0) {
                    System.out.println(
                            "Error! Please enter a positive number. Please enter the amount of gallons again.");
                    gallons = fuel.nextDouble();
                }

                total = gallons * regularPrice;
                System.out.println("Thank you! Here's your reciept: " + total);
                break;

            case 2:
                System.out.println("You have selected: " + plus + ".");
                System.out.println("Please enter gallons");
                gallons = fuel.nextDouble();
                while (gallons <= 0) {
                    System.out.println(
                            "Error! Please enter a positive number. Please enter the amount of gallons again.");
                    gallons = fuel.nextDouble();
                }

                total = gallons * plusPrice;
                System.out.println("Thank you! Here's your reciept: " + total);
                break;

            case 3:
                System.out.println("You have selected: " + supreme + ".");
                System.out.println("Please enter gallons");
                gallons = fuel.nextDouble();
                while (gallons <= 0) {
                    System.out.println(
                            "Error! Please enter a positive number. Please enter the amount of gallons again.");
                    gallons = fuel.nextDouble();
                }

                total = gallons * supremePrice;
                System.out.println("Thank you! Here's your reciept: " + total);
                break;
        }
    }
}