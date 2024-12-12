# hotdog_stand_dogs_sold.py
# Authors: Tanner Klock 
# Created: October 6th, 2023

# Description:
# This program will use a loop to tally the amount of each hotdog sold throughout the day.

TRADITIONAL_HOTDOG = 1
VEGGIE_DOG = 2
CURRY_HOTDOG = 3

traditional_hotdog_tally = 0
veggie_dog_tally = 0
curry_hotdog_tally = 0
selection = 0
finish_tally = False

input("Press any key to begin program")

while (finish_tally == False):
    
    print("\nPlease enter which kind of hotdog was sold")
    print("Traditional hotdog (1)")
    print("Veggie Dog (2)")
    print("Curry Hotdog (3)")
    selection = input("Or finish the tally (4)")

    if (selection.isnumeric):
        if (int(selection) > 0 and int(selection) < 5):
            if (int(selection) == TRADITIONAL_HOTDOG):
                traditional_hotdog_tally = traditional_hotdog_tally + 1
            elif (int(selection) == VEGGIE_DOG):
                veggie_dog_tally = veggie_dog_tally + 1
            elif (int(selection) == CURRY_HOTDOG):
                curry_hotdog_tally = curry_hotdog_tally + 1
            else:
                finish_tally = True
        else:
            print("Please enter a number within the valid range (1-4)")
    else:
        print("Please enter a number within the valid range (1-4)")

print("\nYou sold " + str(traditional_hotdog_tally) + " Traditional hotdogs!")
print("\nYou sold " + str(veggie_dog_tally) + " Veggie dogs!" )
print("\nYou sold " + str(curry_hotdog_tally) + " Curry hotdogs!")


input("\nPress any key to end the program")
