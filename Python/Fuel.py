'''
Programmer:     Corey Jenkins
Date:           March 28, 2024
Filename:       Fuel.cpp
Purpose:        Creating a program using OoP: Mutators and Accessors with input validation or while loops
                to select what fuel type and then calculate the total with the amount of gallon(s) entered
                with the price.
'''

class Fuel:
    def set_name_of_fuel(self, fuel_name):
        self.name_of_fuel = fuel_name
        
    def set_price_of_fuel(self, fuel_price):
        self.price_of_fuel = fuel_price
        
    def get_name_of_fuel(self):
        return self.name_of_fuel
    
    def get_price_of_fuel(self):
        return self.price_of_fuel
    
def main():
        
    my_fuel = Fuel()
    
    regular = 'Regular'
    plus = 'Plus'
    supreme = 'Supreme'
        
    regular_price = 3.99
    plus_price = 4.99
    supreme_price = 5.99
        
    print("1 - Regular")
    print("2 - Plus")
    print("3 - Supreme")
    fuel_select = int(input("Enter your fuel grade:"))
    while fuel_select < 1 or fuel_select > 3:
        print("1 - Regular")
        print("2 - Plus")
        print("3 - Supreme")
        fuel_select = int(input("Error! Please select 1, 2 or 3 and select a fuel type:"))
        
    # New to Python 3.10.xx    
    value = fuel_select 
    match value:
        case 1:
            my_fuel.set_name_of_fuel(regular)
            my_fuel.set_price_of_fuel(regular_price)
            
            print("You have selected", my_fuel.get_name_of_fuel())
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * my_fuel.get_price_of_fuel()
            print("Thank you. Here's your total:", ("%.2f" % total))
            
        case 2:
            my_fuel.set_name_of_fuel(plus)
            my_fuel.set_price_of_fuel(plus_price)
            
            print("You have selected", my_fuel.get_name_of_fuel(),".")
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * my_fuel.get_price_of_fuel()
            print("Thank you. Here's your total:", ("%.2f" % total))
                
        case 3:
            my_fuel.set_name_of_fuel(supreme)
            my_fuel.set_price_of_fuel(supreme_price)
            
            print("You have selected", my_fuel.get_name_of_fuel(), ".")
            gallons = int(input("Enter the amount of gallons:"))
            while gallons <=0:
                gallons = int(input('Error! Please enter a postive number. Please enter gallons:'))
            
            total = gallons * my_fuel.get_price_of_fuel()
            print("Thank you. Here's your total:", ("%.2f" % total))  
main()
            
            
        
        