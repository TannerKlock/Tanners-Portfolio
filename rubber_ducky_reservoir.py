# rubber_ducky_reservoir.py
# Author: Tanner Klock
# Created: September 22, 2023

# Description:
    # This program will take the diemensions of a rubber ducky and a water resevoir, get the surface area of each then outputs
    # the amount of rubber duckys needed to cover the reservoir.

# Constants:
CONVERSION_M_TO_CM = 100
SQUARE = 1
TRIANGLE = 2

# Input:
# ask user if the reservoir is in a triangle or square shape, then the diemensions, and lastly the diemensions of the bottom of the duck.
print("Please choose the shape of the reservoir\n")
shape = int(input("Enter '1' for a Square or '2' for a Triangle: "))
reservoir_length = int(input("\nEnter the length of the reservoir as a whole number and in meters: "))
reservoir_height = int(input("Enter the height of the reservoir as a whole number and in meters: "))
ducky_length = int(input("\nEnter the length of the bottom of the ducky as a whole number and in centimeters: "))
ducky_width = int(input("Enter the width of the bottom of the ducky as a whole number and in centimeters: "))

# Process:
# Start by determining the shape and using the proper formula to determine the surface area of the reservoir.
if shape == SQUARE:
    reservoir_surface_area = reservoir_length*reservoir_height
elif shape == TRIANGLE:
    reservoir_surface_area = (reservoir_length*reservoir_height)/TRIANGLE
# Get the surface area of the rubber duckys.
ducky_surface_area = ducky_length*ducky_width
# convert the reservoir surface area from meters to cm.
reservoir_surface_area = reservoir_surface_area*CONVERSION_M_TO_CM
# divide the surface areas by each other to get the total amount of rubber duckys.
ducky_total = reservoir_surface_area/ducky_surface_area

# Output:
# Prints the total amount of ducks needed to cover the reservoir.
print("\nYou need " + str(ducky_total) + " rubber duckys to cover the reservoir")


monthly_interest_rate = 0.01
one = 1.01
months = 13
future_value = 2,000.00
counter = 0

while counter < months:

    future_value = future_value*one
    counter += 1
print("\n"+future_value)

