/**
 * Programmer:      Corey Jenkins
 * Date:            September 22, 2025
 * Filename:        AreaRectangle.java
 * Purpose:         An OOP that calculates the area of two rectangles.
 */

import java.util.Scanner;

public class AreaRectangle {
    int lengthRectangle;
    int widthRectangle;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        AreaRectangle myShape1 = new AreaRectangle();
        AreaRectangle myShape2 = new AreaRectangle();

        System.out.print("Get the length of rectangle 1:");
        int length1 = input.nextInt();

        while(length1 <= 0)
        {
            System.out.println("You've either entered a negative number or zero.");
            System.out.println("Please enter a positive number.");
            System.out.print("Get the length of rectangle 1: ");
            length1 = input.nextInt();
        }
       
        System.out.print("Get the width of rectangle 1:");
        int width1 = input.nextInt();

        while(width1 <= 0)
        {
            System.out.println("You've either entered a negative number or zero.");
            System.out.println("Please enter a positive number.");
            System.out.print("Get the width of rectangle 1: ");
            width1 = input.nextInt();
        }

         System.out.print("Get the length of rectangle 2:");
        int length2 = input.nextInt();

        while(length2 <= 0)
        {
            System.out.println("You've either entered a negative number or zero.");
            System.out.println("Please enter a positive number.");
            System.out.print("Get the length of rectangle 2: ");
            length2 = input.nextInt();
        }

        System.out.print("Get the width of rectangle 2:");
        int width2 = input.nextInt();

        while(width2 <= 0)
        {
            System.out.println("You've either entered a negative number or zero.");
            System.out.println("Please enter a positive number.");
            System.out.print("Get the width of rectangle 2: ");
            width2 = input.nextInt();
        }

        while (length1 == width1)
        {
           System.out.println("This is an area of a square as both length and width are equal.");
           System.out.println("We are looking for the area of a rectangle. Please enter two different numbers:");
           System.out.print("Get the length of rectangle1: ");
           length1 = input.nextInt();

           System.out.println("Get the width of the rectangle 1: ");
           width1 = input.nextInt();
        }

        while (length2 == width2)
        {
           System.out.println("This is an area of a square as both length and width are equal.");
           System.out.println("We are looking for the area of a rectangle. Please enter two different numbers:");
           System.out.print("Get the length of rectangle 2: ");
           length2 = input.nextInt();

           System.out.println("Get the width of rectangle 2: ");
           width2 = input.nextInt();
        }   
        
        myShape1.lengthRectangle = length1;
        myShape1.widthRectangle = width1;

        myShape2.lengthRectangle = length2;
        myShape2.widthRectangle = width2;

        int areaRectangle1 = myShape1.lengthRectangle * myShape1.widthRectangle;
        int areaRectangle2 = myShape2.lengthRectangle * myShape2.widthRectangle;

        System.out.println("The length and width for rectangle 1 are: " + myShape1.lengthRectangle + " and " + myShape1.widthRectangle);
        System.out.println("The length and width for rectangle 2 are: " + myShape2.lengthRectangle + " and " + myShape2.widthRectangle);

        if(areaRectangle1 == areaRectangle2)
        {
            System.out.println("The areas of the two rectangles are the same!");

        }
        else
        {
            System.out.println("The areas of the rectangles are not the same: " + areaRectangle1 + areaRectangle2);
        }

    }
}


