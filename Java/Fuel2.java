/**
 * Programmer:      Corey Jenkins
 * Date:            September 21, 2025
 * Filename:        Fuel2.java
 * Purpose:         A program that includes all from Fuel.java and adds in a constructor.
 */

import java.util.Scanner;

class Fuel2
{
    // Objects
    String fuelName;
    double fuelPrice;

    public Fuel2(String name, double price)
    {
        fuelName = name;
        fuelPrice = price;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Fuel2 myFuelRegular = new Fuel2("Regular", 3.99);
        Fuel2 myFuelPlus  = new Fuel2("Plus", 4.99);
        Fuel2 myFuelSupreme = new Fuel2("Supreme", 5.99);

        int fuelGradeSelect;
        double gallons;
        double totalAmount;

        System.out.println("Enter the fuel grade.");
        System.out.println("1 - Regular");
        System.out.println("2 - Plus");
        System.out.print("3 - Supreme");
        fuelGradeSelect = input.nextInt();

        while(fuelGradeSelect < 1 || fuelGradeSelect > 3)
        {
            System.out.println("An error has occurred.");
            System.out.println("Please choose 1, 2, or 3.");
            System.out.println("1 - Regular");
            System.out.println("2 - Plus");
            System.out.print("3 - Supreme");
            fuelGradeSelect = input.nextInt();
        }

        switch (fuelGradeSelect)
        {
            case 01 ->  {
                {
                    System.out.println("You have selected: " + myFuelRegular.fuelName);
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextInt();
                    while(gallons < 1)
                    {
                        System.out.println("Please enter a positive number:");
                        System.out.print("Enter the amount of gallons: ");
                        gallons = input.nextInt();
                    }
                    
                    totalAmount = myFuelRegular.fuelPrice * gallons;
                    System.out.printf("Here's your amount: %.2f ", totalAmount);
                }
            }
            case 02 -> {
                System.out.println("You have selected: " + myFuelPlus.fuelName);
                System.out.print("Enter the amount of gallons: ");
                gallons = input.nextInt();
                while(gallons < 1)
                {
                    System.out.println("Please enter a positive number:");
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextInt();
                }

                totalAmount = myFuelPlus.fuelPrice * gallons;
                System.out.printf("Here's your amount: %.2f", totalAmount);
            }

            case 03 -> {
                System.out.println("You have selected: " + myFuelSupreme.fuelName);
                System.out.print("Enter the amount of gallons: ");
                gallons = input.nextInt();
                while(gallons < 1)
                {
                    System.out.println("Please enter a positive number:");
                    System.out.print("Enter the amount of gallons: ");
                    gallons = input.nextInt();
                }

                totalAmount = myFuelSupreme.fuelPrice * gallons;
                System.out.printf("Here's your amount: %.2f", totalAmount);
            }

        }
    }
}