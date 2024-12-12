/* Name: Tanner klock
   Filename: FunWithMath.java
   Date: February 16th, 2024
   Description: This program calculates the current value of an amount of money with interest
 */
import java.text.*;
public class FunWithMath {
    public static void main(String[] args) {
        // Declare and initialize variables
        int MAXINTEREST = 10;
        int MININTEREST = 0;
        double currentvalue = 0;
        double futurevalue = 1000000;
        double annualinterestrate = (Math.random()*(MAXINTEREST - MININTEREST))+MININTEREST;
        double yearsinthefuture = 20;
        // Find the current value
        currentvalue = futurevalue/(1+annualinterestrate)*yearsinthefuture;
        // Format the outputs
        DecimalFormat dollarformat = new DecimalFormat("###,###,###.##");
        DecimalFormat interestformat = new DecimalFormat("0.000");
        // Outputs
        System.out.println("The present value is $" + dollarformat.format(currentvalue));
        System.out.println("The annual interest rate is " + interestformat.format(annualinterestrate)+"%");
    }
}
