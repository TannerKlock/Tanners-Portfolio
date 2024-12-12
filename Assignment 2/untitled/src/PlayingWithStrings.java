/* Name: Tanner Klock
   Filename: PlayingWithStrings.java
   Date: February 16th, 2024
   Description: This program compares a lastname with others in the course and checks if the lastname contains
   a character sequence.
 */
// Imports
import java.util.*;
public class PlayingWithStrings {
    public static void main(String[] args) {
        // Declaring and initializing variables
        String lastname = "Klock";
        String proflast = "Short";
        String peerlast = "Patel";
        String CHARSEQUENCE = "ne";
        // Check lastname and see if it contains a specific sequence of characters
        boolean charseqresult;
        charseqresult = lastname.contains(CHARSEQUENCE);
        int thirdlastletter = lastname.length() - 3;
        // Convert lastname to char to get third last letter
        char[] lastnamechars = lastname.toCharArray();
        // Outputs
        System.out.println("My lastname is " + lastname.length() + " letters long.");
        System.out.println("The third last letter in my lastname is " + lastnamechars[thirdlastletter] + ".");
        System.out.println("My last name in all caps " + lastname.toUpperCase());
        System.out.println("My last name in all lowercase " + lastname.toLowerCase());
        // Conditional outputs
        // Comparing to last name of prof and peers
        if (lastname.equals(proflast)) {
            System.out.println("You have the same lastname as your prof");
        } else if (lastname.equals(peerlast)) {
            System.out.println("You have the same lastname as some of your peers");
        } else System.out.println("You don't have the same lastname as anyone in the course");
        // Comparing to find if the lastname contains the character sequence 'ne'
        if (charseqresult) {
            System.out.println("Your lastname: " + lastname + ", contains the character sequence: " + CHARSEQUENCE);
        } else {
            System.out.println("Your last name: " + lastname + ", does not contain the character sequence: " + CHARSEQUENCE);
        }
    }
}
