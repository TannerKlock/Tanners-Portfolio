# student_profile.py
# Authors: Tanner, Rudy, and Nehan 
# Created: September 11, 2023
# Modified: September 29, 2023

# Description:
# Displays a small set of information about a student including their name, 
# program, and the years to complete that program.

SEMESTERS_PER_YEAR = 2
STUDENT_NUMBER_DIGITS = 9

is_valid = False

# Input.
# Get user input on student's information.

# Get students name and make sure its valid
name = input("Enter the student's name: ")

if name != "":
    is_valid = True
else:
    print("Error: Name cannot be blank")

if is_valid:
    #Get the student number and make sure its valid
    student_number = input("Enter your student number (100xxxxxx, 000xxxxxx, S00xxxxxx):")

    if len(student_number) == STUDENT_NUMBER_DIGITS:
        #Check if last 8 digits are numeric
        if student_number[1:8].isnumeric():
            is_valid = True
            #Check if student number has the correct first digit
            if student_number[0] == '1' or '0' or 'S':
                is_valid = True
            else:
                is_valid = False
                print("Student number must begin with '1', '0', or 'S'")
        else:
            is_valid = False
            print("Error: The last 8 digits need to be numeric")
    else:
        is_valid = False
        print("Student number must be " + str(STUDENT_NUMBER_DIGITS) + " digits")

if is_valid:
    # Get the program name and ensure it's valid 
    program_name = input("Enter the program name: ")

    if program_name != "":
        is_valid = True
    else: 
        print("Error: Program name cannot be blank")

if is_valid:
    # Get the semesters to completeion and ensure its valid
    semesters_to_completeion = int(input("How many semesters will the program take?: "))
    # Check that the semesters are within the valid range
    if semesters_to_completeion < 26 and semesters_to_completeion > 0:
        is_valid = True
    else:
        print("Error: Not a valid program length")
if is_valid:
    # Process.
    # Use the semesters to determine how many years to complete.
    years_to_completeion = semesters_to_completeion / SEMESTERS_PER_YEAR

    # Output.
    # print the student's name with a nice identifier.
    print("Student Name: " + name)
    # print the student's program with an identifier.
    print("Program Name: " + program_name)
    # print the student's years to complete with an identifier.
    print("Years to Complete: " + str(years_to_completeion))

    # Wait for user to press enter to exit the program.
    input("Press 'Enter' to exit the program...")
