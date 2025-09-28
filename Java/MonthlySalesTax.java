/**
 * Programmer:      Corey Jenkins
 * Date:            September 22, 2025 (Updated September 28, 2025)
 * Filename:        MonthlySalesTaxes.java
 * Purpose:         To calculate the sales with taxes from both state and country. Uses OOP and a Constructor.
 */

import java.util.Scanner;
public class MonthlySalesTax
{
    double stateTax;
    double countyTax;

    public MonthlySalesTax(double state, double county)
    {
        stateTax = state;
        countyTax = county;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MonthlySalesTax myTax = new MonthlySalesTax(0.02, 0.04);

        System.out.println("Enter the amount of sales for the month.");
        double sales = input.nextDouble();
        while(sales <= 0)
        {
            System.out.println("An error has occurred.");
            System.out.println("Please enter a positive number.");
            System.out.print("Enter the amount of sales for the month: ");
            sales = input.nextDouble();
        }
        // Formulas
        double salesWithState = sales * myTax.stateTax;
        double salesWithCounty = sales * myTax.countyTax;
        double totalSales = salesWithState + salesWithCounty;

        System.out.println("The amount of sales for the month with state taxes: " + salesWithState + ".");
        System.out.println("The amount of sales for the month with county taxes: " + salesWithCounty + ".");
        System.out.println("Total amount: " + totalSales + ".");
    }
}
