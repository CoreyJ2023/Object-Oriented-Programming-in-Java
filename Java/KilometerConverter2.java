/*
 * Programmer:      Corey Jenkins
 * Date:            September 21, 2025
 * Filename:        KilometerConverter.java
 * Purpose:         An OOP that inputs kilometers and with a formula, to convert it to miles and with a constructor.
 */


import java.util.Scanner;

public class KilometerConverter2
{
    double kilometerFormula;
    
    public KilometerConverter2(double kilo)
    {
        kilometerFormula = kilo;
    }

    public static void main(String[] args) {
        KilometerConverter MyConverter = new KilometerConverter();
        MyConverter.KilometerFormula = 0.6214;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of kilometers: ");
        double kilometers = input.nextDouble();

        while(kilometers < 1)
        {
            System.out.println("An error has occurred.");
            System.out.println("Enter the amount of kilometers: ");
            kilometers = input.nextDouble();
        }

        double miles = MyConverter.KilometerFormula * kilometers;
        double total = miles * 100 / 100;
        System.out.printf("The amount in miles: %.2f", total);
    }
}
