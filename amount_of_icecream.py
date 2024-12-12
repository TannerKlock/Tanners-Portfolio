# amount_of_icecream.py
# Author: Tanner Klock, Sarah Poulsen, Saadat Baig
# Created: September 15, 2023

# Description:
    # This program will take the amount of cones sold over a week. Then turns those integers into a 'mL' amount.
    # It will then output the 'mL' amount so the Ice cream truck will know how much Ice cream they sold.

# Constants:
# The mL amounts of each scoop
# This is knowing that 1 scoop = 120 mL
HALF_SCOOP = 60
ONE_SCOOP = 120
TWO_SCOOP = 240
THREE_SCOOP = 360

# Input:
# Amount of each size sold as integers.
kiddie_cones_sold = int(input("Enter number of kiddie cones sold: "))
small_cones_sold = int(input("Enter number of small cones sold: "))
medium_cones_sold = int(input("Enter number of medium cones sold: "))
large_cones_sold = int(input("Enter number of Large cones sold: "))

# Process:
# convert the amount of cones sold into mL amounts.
kiddie_cones_mL = kiddie_cones_sold * HALF_SCOOP
small_cones_mL = small_cones_sold * ONE_SCOOP
medium_cones_mL = medium_cones_sold * TWO_SCOOP
large_cones_mL = large_cones_sold * THREE_SCOOP
# add all the mL amounts together.
total_mL_sold = kiddie_cones_mL + small_cones_mL + medium_cones_mL + large_cones_mL

# Output:
# Output the total of mL sold over the week.
print("The total amount of ice cream sold in the week was " + str(total_mL_sold) + " mL")

input("\nPress Enter to end the program...")