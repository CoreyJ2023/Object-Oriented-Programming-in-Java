/**
 * Programmer:      Corey Jenkins
 * Date:            September 21, 2025
 * Filename:        Fuel.java
 * Purpose:         A program done using OOP that chooses which grade fuel one wants and then the amount of gallons.
 */

import java.util.Scanner;

class Fuel
{
    // Objects
    String fuelName;
    double fuelPrice;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Fuel myFuelNameRegular = new Fuel();
        Fuel myFuelNamePlus = new Fuel();
        Fuel myFuelNameSupreme = new Fuel();

        Fuel myFuelPriceRegular = new Fuel();
        Fuel myFuelPricePlus = new Fuel();
        Fuel myFuelPriceSupreme = new Fuel();

        myFuelNameRegular.fuelName = "Regular";
        myFuelNamePlus.fuelName = "Plus";
        myFuelNameSupreme.fuelName = "Supreme";

        myFuelPriceRegular.fuelPrice = 3.99;
        myFuelPricePlus.fuelPrice = 4.99;
        myFuelPriceSupreme.fuelPrice = 5.99;

       
        double gallons;
        double totalAmount;

        System.out.println("Enter the fuel grade.");
        System.out.println("1 - Regular");
        System.out.println("2 - Plus");
        System.out.println("3 - Supreme");
        int fuelGradeSelect = input.nextInt();

        while(fuelGradeSelect < 1 || fuelGradeSelect > 3)
        {
            System.out.println("An error has occurred.");
            System.out.println("Please choose 1, 2, or 3.");
            System.out.println("1 - Regular");
            System.out.println("2 - Plus");
            System.out.println("3 - Supreme");
            fuelGradeSelect = input.nextInt();
        }

        switch (fuelGradeSelect)
        {
            case 01 -> {
                System.out.println("You have selected: " + myFuelNameRegular.fuelName);
                System.out.print("Enter the amount of gallons: ");
                gallons = input.nextDouble();
                while(gallons < 1)
                {
                    System.out.println("Please enter a positive number:");
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextDouble();
                }

                totalAmount = myFuelPriceRegular.fuelPrice * gallons;
                System.out.printf("Here's your amount: %.2f ", totalAmount);
            }

            case 02 -> {
                System.out.println("You have selected: " + myFuelNamePlus.fuelName);
                System.out.print("Enter the amount of gallons: ");
                gallons = input.nextDouble();
                while(gallons < 1)
                {
                    System.out.println("Please enter a positive number:");
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextDouble();
                }

                totalAmount = myFuelPricePlus.fuelPrice * gallons;
                System.out.printf("Here's your amount: %.2f ", totalAmount);
            }

            case 03 -> {
                System.out.println("You have selected: " + myFuelNameSupreme.fuelName);
                System.out.print("Enter the amount of gallons: ");
                gallons = input.nextDouble();
                while(gallons < 1)
                {
                    System.out.println("Please enter a positive number:");
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextDouble();
                }

                totalAmount = myFuelPriceSupreme.fuelPrice * gallons;
                System.out.printf("Here's your amount: %.2f " + totalAmount);
            }

        }





       

    }
    
}
