def main():
    
    regular = "Regular"
    plus = "Plus"
    supreme = "Supreme"
    
    regular_price = 3.99
    plus_price = 4.99
    supreme_price = 5.99

    print("1 - Regular")
    print("2 - Plus")
    print("3 - Supreme")
    fuel_select = int(input("Select your grade: "))
    while(fuel_select <= 0 or fuel_select >  3):
        print("Error! Please select a fuel grade from below. These are your options:")
        print("1 - Regular")
        print("2 - Plus")
        print("3 - Supreme")
        fuel_select = int(input())
        
    value = fuel_select
    match value:
        case 1:    
            print("You have selected", regular,".")
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * regular_price
            print("Thank you. Here's your reciept:", ("%.2f" % total))
            
        case 2:
            print("You have selected", plus,".")
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * plus_price
            print("Thank you. Here's your reciept:", ("%.2f" % total))
                
        case 3:    
            print("You have selected", supreme,".")
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * supreme_price
            print("Thank you. Here's your receipt:", ("%.2f" % total))
main()