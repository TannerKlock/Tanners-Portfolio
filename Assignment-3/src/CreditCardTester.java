/*
   Name: Tanner Klock
   File: CreditCardTester.java
   Date: March 4th, 2024
   Description: Testing class for the credit card object class
 */
import java.text.DecimalFormat;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard holder1 = new CreditCard();
        CreditCard holder2 = new CreditCard(5312264554231345L, 1, 24, "Jane Smith");
        CreditCard holder3 = new CreditCard(10234, 4, 22, "Neva Read");

        System.out.println("Displaying holder1 which is set to default values...");
        holder1.displayCardInfo();
        System.out.println("Displaying holder2 with valid data...");
        holder2.displayCardInfo();
        System.out.println("Displaying holder3 with an invalid account number and expiration date...");
        holder3.displayCardInfo();
        System.out.println("verifying account numbers...");
        System.out.println("holder1 valid: " + holder1.verifyAccountNumber());
        System.out.println("holder2 valid: " + holder2.verifyAccountNumber());
        System.out.println("holder3 valid: " + holder3.verifyAccountNumber());
    }
}
