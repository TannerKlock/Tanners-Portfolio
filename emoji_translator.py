# emoji_translator
# Author: Tanner Klock
# Created: November 16th, 2023
# Modified: November 17th, 2023

# Description: This program will allow its user to easily translate some english words into emojis and vice versa.


import string;

# Constants
MENU_ENCODE = "1"
MENU_DECODE = "2"
MENU_EXIT = "3"
ENGLISH_WORDS = ["100", "angry", "apple", "banana", "bird", "brain", "bus", "car", "carrot", "cat", "clap", "cold", "cookie", "dog", "egg", "fish", "fox", "happy", "heart", "horse", "hot", "map", "OK", "sad", "sleep", "tree", "zombie"]
EMOJI_LIST = ["💯", "😠", "🍎", "🍌", "🐦", "🧠", "🚌", "🚗", "🥕", "🐈", "👏", "🥶", "🍪", "🐕", "🥚", "🐟", "🦊", "😀", "❤", "🐎", "🥵", "🗺", "👌", "😢", "🛌", "🌲", "🧟"]

# Variables
user_choice = ""
match_found = False
count = 0
counter = 0

# Functions

# Encoding function
def encode (text_to_encode:str):
    # Split the text into seperate words
    words = text_to_encode.split()
    # Loop through the words list to check all words for matchs
    for count in range(0, len(words), 1):
        # set match_found False to reactivate while loop and compare word to ENGLISH_WORDS list
        match_found = False
        # Use while loop to force it to compare words[index] to ENGLISH_WORDS list
        while (match_found == False):
            # For loop to count through the ENGLISH_WORDS list
            for counter in range(0, len(ENGLISH_WORDS), 1):
                # Check if words match
                if (words[count] == ENGLISH_WORDS[counter]):
                    # If they match replace it with the EMOJI
                    words[count] = EMOJI_LIST[counter]
                    # Set match_found True to exit while loop
                    match_found = True
            # Check to see if the whole ENGLISH_WORDS list was searched 
            if (counter == len(ENGLISH_WORDS)-1):
                # If it has set match_found true to exit loop but don't replace the word
                match_found = True
    # Join the words back together using .join() with a " " to seperate the words       
    output_string = " ".join(words)
    return output_string


# Decode Function
def decode (text_to_decode:str):
    # Split the text into seperate words
    words = text_to_decode.split()
    # Loop through the words list to check all words for matchs
    for count in range(0, len(words), 1):
        # set match_found False to reactivate while loop and compare word to EMOJI_LIST
        set_match = False
        # Use while loop to force it to compare words[index] to EMOJI_LIST
        while (set_match == False):
            # For loop to count through the EMOJI_LIST
            for counter in range(0, len(EMOJI_LIST), 1):
                # Check if words match
                if (words[count] == EMOJI_LIST[counter]):
                    # If they match replace it with the EMOJI and set match_found true
                    words[count] = ENGLISH_WORDS[counter]
                    set_match = True
            # Check if the whole EMOJI_LIST was compared
            if (counter == len(EMOJI_LIST)-1):
                # If it was with no matchs found set match_found true to exit while loop
                set_match = True  
    # Join the words back together using .join() with a " " to seperate the words 
    output_string = " ".join(words)
    return output_string

# MENU runs until user exits program
while user_choice != MENU_EXIT:
    # Display menu options
    print("\nEmoji Translator Main Menu")
    print("Encode (" + MENU_ENCODE + ")")
    print("Decode (" + MENU_DECODE + ")")
    print("Exit (" + MENU_EXIT + ")")

    # Get users choice
    user_choice = input("Please select an option " + MENU_ENCODE + "-" + MENU_EXIT + ": ")
    
    # If statements to check what the user chose 
    if (user_choice == MENU_ENCODE):
        # If they want to encode get text input then use encode function
        user_choice = input("Please enter text to encode: ")
        print("\n" + encode(user_choice))
    elif (user_choice == MENU_DECODE):
        # If they want to decode get text input then use decode function
        user_choice = input("Please enter text to decode: ")
        print("\n"  + decode(user_choice))
    # Check if the user inputted the exit key if they didn't and both previous if statements failed, the inputs invalid
    elif (user_choice != MENU_EXIT):
        # If the user didn't enter one of the three options state it was an invalid input and to enter their choice again
        print("Please select a valid option in the range " + MENU_ENCODE + "-" + MENU_EXIT + ": ")
    else:
        # If all previous if statements are false then user selected exit
        print("Exiting...")