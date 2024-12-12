/* Name: Tanner Klock
   Filename: Temp.java
   Date: February 16th,2024
   Description: converts a fahrenheit temperature value to celsius
 */
import java.util.*;
public class Temp {
    public static void main(String[] args) {
        // Constants and variables
        double MAXVALUE = 135.0;
        double MINVALUE = -130.0;
        double fahrenheitvalue = 0;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        // Validation while loop
        while(!valid) {
            System.out.println("Please enter a numeric fahrenheit value in the range -130 to 135 F");
            // Try to save input as numeric value if fails get new input
            try {
                fahrenheitvalue = input.nextDouble();
                // Once input is found to be a number check that its in the valid range
                if (fahrenheitvalue < MINVALUE || fahrenheitvalue > MAXVALUE) {
                    System.out.println("ERROR: Please enter a number within the valid range of -130 to 135");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Please enter a numeric value");
                input.next();
            }
        }
        System.out.println(fahrenheitvalue + " F is " + TempConversion(fahrenheitvalue) + " Celsius");
    }
    public static double TempConversion(double fahrenheitemp) {
        double celsiusvalue;
        celsiusvalue = (fahrenheitemp-32)*5/9;
        return celsiusvalue;
    }
}
