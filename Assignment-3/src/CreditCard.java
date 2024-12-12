/*
   Name: Tanner Klock
   File: CreditCard.java
   Date: March 4th, 2024
   Description: This class creates credit card objects, displays the attributes with their values,
   and it can verify the length of account numbers.
 */
import java.text.DecimalFormat;
public class CreditCard {
    private long accountnumber;
    private int month;
    private int year;
    private String holder;
    // Set default values as constants
    private String DEFAULT_NAME = "Bob Loblaws";
    private long DEFAULT_ACCOUNT_NUMBER = 1234567890123456L;
    private int DEFAULT_MONTH = 1;
    private int DEFAULT_YEAR = 99;
    // Constant for account number length
    public long ACCOUNT_NUMBER_LENGTH = 16;


    CreditCard(long l, int m, int y, String h) {
        accountnumber = l;
        month = m;
        year = y;
        holder = h;
    }
    CreditCard() {
        accountnumber = DEFAULT_ACCOUNT_NUMBER;
        month = DEFAULT_MONTH;
        year = DEFAULT_YEAR;
        holder = DEFAULT_NAME;
    }

    public void displayCardInfo() {
        // Decimal format object to display single digit months and years with a leading zero
        DecimalFormat leadingzero = new DecimalFormat("00");
        System.out.println(this.holder);
        System.out.println(this.accountnumber);
        System.out.println(leadingzero.format(this.month) +"/"+ leadingzero.format(this.year));
    }
    public boolean verifyAccountNumber() {
        // Use wrapper class so the value is no longer primitive
        Long verifyaccount = this.accountnumber;
        // Convert to string to get length
        String length = verifyaccount.toString();
        // Compare length to variable length
        if (length.length() == ACCOUNT_NUMBER_LENGTH) {
            return true;
        }
        else {
            return false;
        }
    }
}