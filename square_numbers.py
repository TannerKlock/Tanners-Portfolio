# square_numbers.py
# Author: Tanner Klock 
# Created: October 20th, 2023

# Description:
# This program will take 2 numbers within 1 to 10000 and return all of the square numbers within that range.

# Import math to get access to the isqrt function
import math
# CONSTANTS
MINIMUM_LOWER_BOUND = 1
MAX_UPPER_BOUND = 10000
IS_LOWER = 'lower'
IS_UPPER = 'upper'

lower_bound_valid = False
is_valid = False

# Validation function
def validation (user_input, lower_or_upper:str, lower:int):
    # Check if the input is a number
    if(user_input.isnumeric() == False):
        # Prints error message and returns false
        print("Please enter a number\n")
        return False
    # Makes sure the input is within the valid range of input
    elif(int(user_input) < MINIMUM_LOWER_BOUND or int(user_input) > MAX_UPPER_BOUND):
        # Prints error message and returns false
        print("please enter a number between "+ str(MINIMUM_LOWER_BOUND) +" to " + str(MAX_UPPER_BOUND))
        return False
    # Check that the upper bound is greater then the lower bound
    if(lower_or_upper == IS_UPPER):
        try:
            int(user_input) > lower
        except:
            # if it is lower print error message and return false
            input("Upper boundary must be greater than lower boundary\n")
            return False
    else:
        return True


# Inform the user of a valid input
print("Please enter a whole number between "+ str(MINIMUM_LOWER_BOUND) +" to "+ str(MAX_UPPER_BOUND))
while (is_valid == False):
    # Start with getting the upper and lower boundary
    # Check if the input is valid
    while(lower_bound_valid == False):
        lower_bound = input("Please enter the lower boundary: ")
        lower_bound_valid = validation(lower_bound, IS_LOWER, MINIMUM_LOWER_BOUND)
    # If first input is valid move to the next
    while (is_valid == False and lower_bound_valid == True):
        upper_bound = input("Please enter the upper boundary: ")
        is_valid = validation(upper_bound, IS_UPPER, lower_bound)

# Once all inputs are valid we can move onto the process
else:

    # Print initial output banner before starting loop
    print("\n***************************************************") 
    print("Square numbers from " + str(lower_bound) + " to " + str(upper_bound)) 
    print("****************************************************")

    # Loop to make sure that we are only checking numbers within the requested range 
    next_number = int(lower_bound)
    for next_number in range(int(lower_bound), int(upper_bound)+ 1,1):

        # Multiply the square root by itself immediately to get the most accurate results
        square_root = math.isqrt(next_number) **2

        # Check if it equals the original number 
        if (square_root == int(next_number)):
            # Convert it back to the square root
            square_root = math.isqrt(next_number)
            # Print the output
            print(str(next_number) + " (" + str(int(square_root)) + " squared)")

    input("\nPress 'enter' to exit the program")
   
