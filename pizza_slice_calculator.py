# pizza_slice_calculator
# Author: Tanner Klock
# Date: December 1st, 2023

# Description: This prgram will provide the user with a calculator that can output the amount of pizza slices and
# The area of each slice based on an inputted diameter of a pizza.

# Imports
from tkinter import *
from tkinter.tix import *
import sys
import math

# GUI Constants
WINDOW_WIDTH = 480
WINDOW_HEIGHT = 165
WINDOW_MIN_WIDTH = 420
WINDOW_MIN_HEIGHT = 135

# Pizza Constants
MINIMUM_PIZZA_DIAMETER = 6
MAXIMUM_PIZZA_DIAMETER = 36
FOUR_SLICE_MIN = 6
SIX_SLICE_MIN = 8
EIGHT_SLICE_MIN = 12
TEN_SLICE_MIN = 14
TWELVE_SLICE_MIN = 16
SIXTEEN_SLICE_MIN = 20
SLICES_LIST = [4, 6, 8, 10, 12, 16]


# Create a window using tkinter
window = Tk()
# Set the geometry of the window
window.geometry(f"{WINDOW_WIDTH}x{WINDOW_HEIGHT}")
window.minsize(width = WINDOW_MIN_WIDTH, height = WINDOW_MIN_HEIGHT)
# Give the window a title
window.title("Pizza Slice Calculator")

# Create a balloon for tooltips
tooltip = Balloon(window)

# Calculate function to get the amount of slices and area
def calculate(_event = None):
    try:
        # Get the value from entry_pizza_diameter and treat it as a number.
        pizza_diameter = float(entry_pizza_diameter.get())
            # Compare the diameter to the minimum diameter and maximum diameter input if its a number.
        if (pizza_diameter >= MINIMUM_PIZZA_DIAMETER and pizza_diameter <= MAXIMUM_PIZZA_DIAMETER):
            # If its within the range start comparing it with the diameter ranges for slices
            # Four slice pizza
            if(pizza_diameter >= FOUR_SLICE_MIN and pizza_diameter < SIX_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into "+ str(SLICES_LIST[0]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[0]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
            # Six slice pizza
            elif(pizza_diameter >= SIX_SLICE_MIN and pizza_diameter < EIGHT_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into " + str(SLICES_LIST[1]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[1]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
            # Eight slice pizza
            elif(pizza_diameter >= EIGHT_SLICE_MIN and pizza_diameter < TEN_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into " + str(SLICES_LIST[2]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[2]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
            # Ten slice pizza
            elif(pizza_diameter >= TEN_SLICE_MIN and pizza_diameter < TWELVE_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into " + str(SLICES_LIST[3]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[3]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
            # Twelve slice pizza
            elif(pizza_diameter >= TWELVE_SLICE_MIN and pizza_diameter < SIXTEEN_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into " + str(SLICES_LIST[4]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[4]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
            # Sixteen slice pizza
            elif(pizza_diameter >= SIXTEEN_SLICE_MIN):
                label_pizza_slices.configure(text = "Your pizza can be cut into " + str(SLICES_LIST[5]) + " slices.")
                slice_area = (math.pi * (pizza_diameter/2) ** 2)/SLICES_LIST[5]
                label_slice_area.configure(text = "Each slice has an area of " + str(round(slice_area, 2)) + '\"' + " squared" )
        # If it doesn't fit in the input range output error message 
        else:
            label_error_output.configure(text = "ERROR: Diameter must be between " + str(MINIMUM_PIZZA_DIAMETER) + " and " +str(MAXIMUM_PIZZA_DIAMETER)+ " inches.")
    # If they didn't input a number:
    except:
        # Show an error message in the output labels
        label_error_output.configure(text = "ERROR: Please enter a numeric diameter.")

# Clear function to set everything back to default
def clear(_event = None):
    entry_pizza_diameter.delete(0, END)
    label_slice_area.configure(text = "")
    label_pizza_slices.configure(text = "")
    label_error_output.configure(text = "")
    entry_pizza_diameter.focus()

# Use sys import for simple exit function
def close_application(_event = None):
    sys.exit()

# Row 0 widgets
label_pizza_diameter = Label(text = "Pizza diameter (Inches):")
label_pizza_diameter.grid(row = 0, column = 0, sticky = E)
entry_pizza_diameter = Entry()
entry_pizza_diameter.grid(row = 0, column = 1, columnspan= 2)
tooltip.bind_widget(entry_pizza_diameter, msg = "Enter the pizza diameter in inches within the range of " + str(MINIMUM_PIZZA_DIAMETER)+'\"' + " - " + str(MAXIMUM_PIZZA_DIAMETER)+'\"')


# Row 1 widgets
label_pizza_slices = Label(text = "", relief=GROOVE)
label_pizza_slices.grid(row = 1, column = 0, sticky = E)
label_slice_area = Label(text = "", relief=GROOVE)
label_slice_area.grid(row = 1, column = 1, sticky = W)

# Row 2 widgets
button_calculate = Button(text = "Calculate", width =15, command = calculate)
button_calculate.grid(row = 2, column = 0, sticky = E)
button_clear = Button(text = "Clear", width = 15, command = clear)
button_clear.grid(row = 2, column = 1 , sticky = W)
tooltip.bind_widget(button_calculate, msg = "Click this to calculate the amount of slices and area of a pizza")
tooltip.bind_widget(button_clear, msg = "Click this to clear all inputs and outputs setting the program to its default state")

# Row 3 widgets
label_error_output = Label(text = "")
label_error_output.grid(row = 3, column = 0, columnspan = 3)

# Row 4 widgets
button_exit = Button(text = "Exit", width = 30, command = close_application)
button_exit.grid(row = 4, column = 0, columnspan= 3)
tooltip.bind_widget(button_exit, msg = "Press this button to exit the program")

# Hotkeys
window.bind("<Return>", calculate)
window.bind("<Alt-c>", calculate)
window.bind("<Alt-e>", clear)
window.bind("<Alt-x>", close_application)

window.mainloop()