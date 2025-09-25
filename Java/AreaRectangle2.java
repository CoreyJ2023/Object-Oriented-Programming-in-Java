/**
 * Programmer:      Corey Jenkins
 * Date:            September 22, 2025
 * Filename:        AreaRectangle.java
 * Purpose:         An OOP that calculates the area of two rectangles  and determined if the areas of both are the same or not. 
 *                  This includes a constructor.
 */


import java.util.Scanner;

public class AreaRectangle2
{
    int rectangleLength;
    int rectangleWidth;

    public AreaRectangle2(int length, int width)
    {
        rectangleLength = length;
        rectangleWidth = width;
    }
 
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        AreaRectangle2 myShape1 = new AreaRectangle2(30, 25);
        AreaRectangle2 myShape2 = new AreaRectangle2(30, 25);

        int areaRectangle1 = myShape1.rectangleLength * myShape1.rectangleWidth;
        int areaRectangle2 = myShape2.rectangleLength * myShape2.rectangleWidth;

        System.out.println("The length and width for rectangle 1 are: " + myShape1.rectangleLength + " and " + myShape1.rectangleWidth);
        System.out.println("The length and width for rectangle 2 are: " + myShape2.rectangleLength + " and " + myShape2.rectangleWidth);

        if(areaRectangle1 == areaRectangle2)
        {
            System.out.println("The areas of the two rectangles are the same!"); // This will print out. They're the same!

        }
        else
        {
            System.out.println("The areas of the rectangles are not the same: " + areaRectangle1 + areaRectangle2);
        }

    }
}


