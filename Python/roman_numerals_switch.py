'''
Programmer:         Corey Jenkins
Date:               December 15, 2024
Filename:           roman_numerals_switch.py
Purpose:            To create a program that gives an error if a roman numeral is used outside I through X.
                    Input validtion and case/switch are used. Case/switch was added in Python V3.xx
'''

def main():
    print("Enter a number between 1 to 10: ")
    the_roman_numerals()
    
def the_roman_numerals():
    roman_numeral_1 = "I"
    roman_numeral_2 = "II"
    roman_numeral_3 = "III"
    roman_numeral_4 = "IV"
    roman_numeral_5 = "V"
    roman_numeral_6 = "VI"
    roman_numeral_7 = "VII"
    roman_numeral_8 = "VIII"
    roman_numeral_9 = "XI"
    roman_numeral_10 = "X"

    number = int(input())
    
    while(number < 1 or number > 10):
        print("ERROR!")
        number = int(input("Enter a number between 1 to 10: "))
        
    if(number == 1):
        print(roman_numeral_1)
    elif(number == 2):
        print(roman_numeral_2)
    elif(number == 3): 
        print(roman_numeral_3)
    elif(number == 4):
        print(roman_numeral_4)
    elif(number == 5):
        print(roman_numeral_5)
    elif(number == 6):
        print(roman_numeral_6)
    elif(number == 7):
        print(roman_numeral_7)
    elif(number == 8):
        print(roman_numeral_8)
    elif(number == 9):
        print(roman_numeral_9)
    elif(number == 10):
        print(roman_numeral_10)
        
main()