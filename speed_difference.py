# Author: Tanner Klock
# Date: November 24th, 2023
# Description: This program will take 2 speeds from the user and output the difference in minutes. 


# Imports
from tkinter import *
from tkinter.tix import *
from idlelib.tooltip import Hovertip
import sys


# Constants
WINDOW_WIDTH = 700
WINDOW_HEIGHT = 180

WINDOW_MIN_WIDTH = 675
WINDOW_MIN_HEIGHT = 165

# Create a window using tkinter
window = Tk()
# Set the geometry of the window
window.geometry(f"{WINDOW_WIDTH}x{WINDOW_HEIGHT}")
window.minsize(width = WINDOW_MIN_WIDTH, height = WINDOW_MIN_HEIGHT)
# Give the window a title
window.title("Speed Difference")

# Create a balloon for tooltips
tooltip = Balloon(window)

# Calculate function to get the speed difference
def calculate(_event = None):
    try:
        MINUTES_PER_HOUR = 60

        # Get the value from entry_speed_1 and treat it as a number.
        speed_one = float(entry_current_speed.get())
        # Get the value from entry_speed_2 and treat it as a number.
        speed_two = float(entry_desired_speed.get())

        low_speed = min((speed_one, speed_two))
        high_speed = max((speed_one, speed_two))

        speed_difference = high_speed - low_speed

        speed_difference_minutes = speed_difference / MINUTES_PER_HOUR

        label_output.configure(text = "Going from " + str(round(low_speed, 1)) + "km/h to " + str(round(high_speed, 1)) + \
                               "km/h can gain you " + str(round(speed_difference_minutes, 2)) + " kilometres per minute.")
        
    # If they don’t both have numbers:
    except:
        # Show an error message in the output labels
        label_output.configure(text = "Error: speed entries must be numeric.")

# Reset function to set everything back to default
def reset(_event = None):
    entry_current_speed.delete(0, END)
    entry_desired_speed.delete(0, END)
    label_output.configure(text = "")
    entry_current_speed.focus()

# Use sys import for simple exit function
def close_application(_event = None):
    sys.exit()


# Row 0 widgets.
label_current_speed = Label(text = "Current Speed:")
label_current_speed.grid(row = 0, column = 0, padx = 5, pady = 5, sticky = E)
entry_current_speed = Entry()
entry_current_speed.grid(row = 0, column = 1, columnspan = 2, padx = 5, pady = 5, sticky = W)
tooltip.bind_widget(entry_current_speed, msg = "Enter your current speed here")

# Row 1 widgets
label_desired_speed = Label(text = "Desired Speed:")
label_desired_speed.grid(row = 1, column = 0, padx = 5, pady = 5, sticky = E)
entry_desired_speed = Entry()
entry_desired_speed.grid(row = 1, column = 1, columnspan = 2, padx = 5, pady = 5, sticky = W)
tooltip.bind_widget(entry_desired_speed, msg = "Enter your desired speed here")

# Row 2 widgets
label_output_prompt = Label(text = "Speed Difference:")
label_output_prompt.grid(row = 2, column = 0, padx = 5, pady = 5, sticky = E)
label_output = Label(width = 75, bd = 2, relief = SUNKEN)
label_output.grid(row = 2, column = 1, padx = 5, pady = 5, sticky = W)
tooltip.bind_widget(label_output, msg = "Speed difference is displayed here")

# Row 3 widgets
button_calculate = Button(text = "Calculate", width = 15, command = calculate)
button_calculate.grid(row = 3, column = 0, padx = 5, pady = 5, sticky = E)
tooltip.bind_widget(button_calculate, msg = "Click this button to calculate speed difference (Return)")
button_reset = Button(text = "Reset", width = 15, command = reset)
button_reset.grid(row = 3, column = 1, padx = 5, pady = 5, sticky = E)
tooltip.bind_widget(button_reset, msg = "Click this button to clear current input and calculation (Alt-c)")

# Row 4 widgets
button_exit = Button(text = "Exit", width = 50, command = close_application)
button_exit.grid(row = 4, column = 1, columnspan = 3, padx = 5, pady = 5, sticky = W)
tooltip.bind_widget(button_exit, msg = "Click this to exit the program (Alt-e)")

# Add hotkey support.
window.bind("<Return>", calculate)
window.bind("<Alt-c>", reset)
window.bind("<Alt-e>", close_application)

# Anything else?



window.mainloop()

