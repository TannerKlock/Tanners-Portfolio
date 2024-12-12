/*
   Name: Tanner Klock
   File: ICE3.java
   Date: March 22nd, 2024
   Description: This program will take a number of values get the sum, then divide it by a final input.
 */
import java.util.*;

public class ICE3 {
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        String userLastName;
        Integer valueCount = null;
        Integer divisor;
        Integer sum = 0;
        // Boolean variables for validation
        boolean validDivisor;
        boolean isDivisor;
        boolean validValue;
        // Temp will temporarily store inputs to be validated
        String temp;


        // Prompt for the users name
        System.out.print("Please enter your last name: ");
        userLastName = input.next();
        // Prompt for amount of values
        System.out.print("Enter the count of values: ");
        temp = input.next();
        // Continue to prompt user for input until a valid value is stored in valueCount variable
        while (valueCount == null) {
            isDivisor = false;
            if (validate(temp, userLastName, isDivisor)) {
                valueCount = Integer.parseInt(temp);
            } else {
                temp = input.next();
            }
        }

        // Initialize the array with the amount of values to be stored
        Integer[] values = new Integer[valueCount];
        // For loop to fill the array with valid inputs
        for (int i = 0; i < valueCount; i++) {
            isDivisor = false;
            String valuePrompt = String.format("Please enter value %d: ", i+1);
            System.out.print(valuePrompt);
            temp = input.next();
            validValue = validate(temp, userLastName, isDivisor);
            while (!validValue) {
               temp = input.next();
               validValue = validate(temp, userLastName, isDivisor);
            }
            values[i] = Integer.parseInt(temp);
        }

        // Calculate the sum
        for (int j = 0; j < valueCount; j++) {
            sum += values[j];
        }
        String sumMsg = String.format("The sum is: %d", sum);
        System.out.println(sumMsg);

        // Prompt for the divisor
        System.out.println("Enter a number to divide the sum: ");
        temp = input.next();
        // Set isDivisor to true before validating
        isDivisor = true;
        validDivisor = validate(temp, userLastName, isDivisor);
        // Continue to get user input until it is valid
        while (!validDivisor) {
            temp = input.next();
            validDivisor = validate(temp, userLastName, isDivisor);
        }
        divisor = Integer.parseInt(temp);

        String dividedMsg = String.format("The divison of %d/%d = %d", sum, divisor, sum/divisor);
        System.out.println(dividedMsg);
    }

    // Validation method
    public static boolean validate(String s, String name, boolean isDivisor) {
        boolean isNumeric = false;
        boolean isValid = false;
        // Formatted error messages
        String notNumeric = String.format("Hi %s, you have not entered a numeric value, please enter a number", name);
        String divideZero = String.format("Hi, %s, This will cause a divide by 0 exception, please enter a non-zero value ", name);
        // If number isn't divisor just check if its numeric
        if (!isDivisor) {
            isValid = true;
        }
        try {
            Integer i = Integer.parseInt(s);
            isNumeric = true;
            // If value isDivisor check if its equal to zero
            if (isNumeric && isDivisor) {
                if (i == 0) {
                    throw new InvalidDivisor(divideZero);
                } else {
                    isValid = true;
                }
            }
        // Catch exceptions if input is not numeric and output error message
        } catch (NumberFormatException e) {
            System.out.println(notNumeric);
            isNumeric = false;
        } catch (InvalidDivisor ex) {
            System.out.println(ex.toString());
            isValid = false;
        }
        // Return if input is valid or not
        return isValid && isNumeric;
    }
}