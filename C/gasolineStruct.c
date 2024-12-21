/*
 *  Programmer:     Corey Jenkins
 *  Date:           November 11, 2024
 *  Filename:       gasolineStruct.c
 *  Purpose:        To construct a fueling program that uses structs, a case/switch
*/

#include <stdio.h>

struct GasolineSelect
{
    double regular;
    double plus;
    double supreme;
};

int main()
{
    struct GasolineSelect MyGas;
    MyGas.regular = 2.99;
    MyGas.plus = 3.99;
    MyGas.supreme = 4.99;

    int gasSelect;
    double gallonsRegular, gallonsPlus, gallonsSupreme;
    double regularTotal, plusTotal, supremeTotal;

    printf("Please select your fuel grade:\n");
    printf("1 - Regular\n");
    printf("2 - Plus\n");
    printf("3 - Supreme\n");
    scanf("%d", &gasSelect);
    
    // Input validation.
    while (gasSelect < 1 || gasSelect > 3)
    {
        printf("An error has occurred.\n");
        printf("Please select your fuel grade:\n");
        printf("1 - Regular\n");
        printf("2 - Plus\n");
        printf("3 - Supreme\n");
        scanf("%d", &gasSelect);
    }

    switch(gasSelect)
    {
        case 01:
            printf("You have entered Regular. Please enter how many gallons:");
            scanf("%lf" , &gallonsRegular);

            // Input validation.
            while(gallonsRegular < 0)
            {
                printf("And error has occurred.\n");
                printf("Please enter a positive number\n");
                printf("Please enter the amount of gallons:");
                scanf("%lf",  &gallonsRegular);
            }
            regularTotal = gallonsRegular * MyGas.regular;
            printf("Here's the total. Thanks for fueling up:\n");
            printf("$%.2lf", regularTotal);
            break;
        
        case 02:
            printf("You have entered Plus. Please enter how many gallons.");
            scanf("%lf", &gallonsPlus);

            // Input validation.
            while(gallonsPlus < 0)
            {
                printf("An error has occurred\n");
                printf("Please enter a positive number\n");
                printf("Please enter the amount of gallons:");
                scanf("%lf", &gallonsPlus); 
            }
            plusTotal = gallonsPlus * MyGas.plus;
            printf("Here's the total. Thanks for fueling up:\n");
            printf("$%.2lf", plusTotal);
            break;

        case 03:
            printf("You have selected supreme. Enter the amount of gallons: ");
            scanf("%lf", &gallonsSupreme);

            // Input validation.
            while(gallonsSupreme < 0)
            {
                printf("An error has occurred.\n");
                printf("Please enter a positive number\n");
                printf("Please enter the amount of gallons:\n");
                scanf("%lf", &gallonsSupreme);
            }
            supremeTotal = gallonsSupreme * MyGas.supreme;
            printf("Here is your total." "Thankks for fueling up:\n");
            printf("$%.2lf", supremeTotal);
            break;
        
        // Input validation.
        default:
        printf("Error has occurred.\n");
        printf("Please select 1 for regular, 2 for Plus, or 3 for Supreme:");
        scanf("%d", gasSelect);
    }
    
    return 0;
}