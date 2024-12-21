/*
 *  Programmer:     Corey Jenkins
 *  Date:           November 12, 2024
 *  Filename:       gasolineSelection.c
 *  Purpose:        A program to select the fuel grade and how much gallons of fuel to enter.
 *                  This program uses the case switch and while loop for input validations.
*/

#include <stdio.h>

int main()
{
    int gasSelect;

    double regularPrice = 3.99;
    double plusPrice = 4.99;
    double supremePrice = 5.99;

    double gallonsRegular, gallonsPlus, gallonsSupreme;
    double totalRegular, totalPlus, totalSupreme;

    printf("Enter your fuel grade\n");
    printf("1 - Regular\n");
    printf("2 - Plus\n");
    printf("3 - Supreme\n");
    scanf("%d: ", &gasSelect);

    while(gasSelect < 0 || gasSelect > 3)
    {
        printf("An error has occurred.\n");
        printf("Please select a fuel grade:\n");
        printf("1 - Regular\n");
        printf("2 - Plus\n");
        printf("3 - Supreme\n");
        scanf("%d", &gasSelect);
    }

    switch (gasSelect)
    {
        case 01:
            printf("You have selected Regular.\n");
            printf("Enter the amount of gallons to fuel up:");
            scanf("%lf", &gallonsRegular);
            while(gallonsRegular < 1)
            {
                printf("An error has occurred.");
                printf("Please enter a non-negative number:");
                scanf("%lf", &gallonsRegular);
            }

            totalRegular = gallonsRegular * regularPrice;
            printf("Thank you for fueling with us. Your total:");
            printf("%.2lf", totalRegular);
        break;

        case 02:
            printf("You have selected Plus.");
            printf("Enter the amount of gallons to fuel up:");
            scanf("%lf", &gallonsPlus);
            while(gallonsPlus < 1)
            {
                printf("An error has occurred.");
                printf("Please enter a non-negative number:");
                scanf("%lf", gallonsPlus);
            }

            totalPlus = gallonsPlus * plusPrice;
            printf("Thank you for fueling with us. Your total:");
            printf("$%.2lf", totalPlus);
        break;

        case 03:
            printf("You have selected Regular.");
            printf("Enter the amount of gallons to fuel up:");
            scanf("%lf", &gallonsSupreme);
            while(gallonsSupreme < 1)
            {
                printf("An error has occurred.");
                printf("Please enter a non-negative number:");
                scanf("%lf", gallonsSupreme);
            }

            totalSupreme = gallonsSupreme * supremePrice;
            printf("Thank you for fueling with us. Your total:");
            printf("$%.2lf", totalSupreme);
        break;
    }

    return 0;
}