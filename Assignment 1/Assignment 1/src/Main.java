// Name: Tanner Klock
// Date: February 5th 2024
// Description:

// Imports
import java.util.Scanner;
//Course info class
/* Name: Tanner Klock
   Date: February 5th, 2024
   Filename: CourseInfo.java
   Description: A program that quickly displays all my course info
 */
class CourseInfo {
    public static void courseinfo() {
        // Prints course info onto terminal
        System.out.println("Tanner Klock - Computer Systems Technician embebed Ontario Tech");
        System.out.println("Professor - Yuvaraj Sambandan");
        System.out.println("COSC 1200 - Object Oriented Programming 1");
        System.out.println("Tuesday 11am - 1pm Wednesday 12pm - 2pm Friday 8am - 10am");
        System.out.println("Room SW215         Room A317             Room SW110");
    }
}
/* Name: Tanner Klock
   Date: February 5th, 2024
   Filename: VariableDemo.java
   Description: A program to display different variables along with their data types.
 */
class VariableDemo
{
    public static void main(String[] args)
    {
        // declare and initialize variables and a constant
        char charD = 'D';
        double doubleNumber = 4.8;
        int intFive = 5;
        boolean trueFalse = true;
        final double INTEREST_RATE = 2.5; // constant
        String helloSpring = "Hello Spring 2023!";
        // added variables
        short shortnum = 32760;
        long longnum;
        byte bytes = 120;
        Float floatnum = Float.valueOf(3.6F);
        longnum = floatnum.longValue();

        // display variable contents
        System.out.println("charD = " + charD);
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("intFive = " + intFive);
        System.out.println("trueFalse = " + trueFalse);
        System.out.println("INTEREST_RATE = " + INTEREST_RATE);
        System.out.println("helloSpring = " + helloSpring);
        System.out.println("shortnum = " + shortnum);
        System.out.println("longnum = " + longnum);
        System.out.println("bytes = " + bytes);
        System.out.println("floatnum = " + floatnum);
        // Add additional functionality here

    }
}
/* Name: Tanner Klock
   Date: February 5th, 2024
   Filename: IfDemo.java
   Description: This program takes a numeric final grade as input and outputs the letter grade equivalent.
 */
class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Constants
        int A_MAX = 100;
        int A_MIN = 90;
        int B_MIN = 80;
        int C_MIN = 70;
        int D_MIN = 60;
        int E_MIN = 50;
        // Variables
        char lettergrade = 0;
        int numgrade;
        String status = null;
        // Get the numeric final grade
        System.out.print("Please enter your final grade: ");
        numgrade = input.nextInt();
        // Compare grade with ranges for letter grades
        if (numgrade >= A_MIN && numgrade <= A_MAX) {
            lettergrade = 'A';
        } else if (numgrade >= B_MIN && numgrade < A_MIN) {
            lettergrade = 'B';
        } else if (numgrade >= C_MIN && numgrade < B_MIN) {
            lettergrade = 'C';
        } else if (numgrade >= D_MIN && numgrade < C_MIN) {
            lettergrade = 'D';
        } else if (numgrade >= E_MIN && numgrade < D_MIN) {
            lettergrade = 'E';
        } else if (numgrade < E_MIN && numgrade > 0) {
            lettergrade = 'F';
        } else {
            System.out.println("Invalid Input enter a grade within 0 - 100");
        }
        // Set status to fail or pass based on letter grade
        if (lettergrade == 'F') {
            status = "Failed";
        } else if (lettergrade != 0){
            status = "Passed";
        }
        // Output results
        System.out.println("Your letter grade is " + lettergrade + " you " + status + " the course");
    }
}
/* Name: Tanner Klock
   Date: February 5th, 2024
   Filename: SwitchDemo.java
   Description: This program takes your letter grade and outputs a response based on it
 */
class SwitchDemo {
    public static void switchdemo() {
        char lettergrade = 'A';
        switch(lettergrade) {
            case 'A':
                System.out.println("Great Work!");
                break;
            case 'B':
                System.out.println("Good Work!");
                break;
            case 'C':
                System.out.println("Average Work");
                break;
            case 'D':
                System.out.println("Below average work");
                break;
            case 'F':
                System.out.println("Unsatisfactory work");
                break;
            default:
                System.out.println("Invalid letter grade: " + lettergrade);
                break;
        }
    }
}
/* Name: Tanner Klock
   Date: February 5th, 2024
   Filename: LoopDemo.java
   Description: This program demonstrates how different loops work in java by outputting their counts.
 */
class LoopDemo
{
    public static void main(String[] args)
    {

        // while loop
        int i = 1; // declare & initialize loop counter variable
        while(i <= 3) // loop while i is < = 3
        {
            System.out.println("while loop: i = " + i);
            i = i + 1; // increment loop counter
        }

        // do loop
        int j = 1;
        do
        {
            System.out.println("do loop: j = " + j);
            j++;				// use the increment operator
        } while(j <= 3);


        // pre-test & post-test compared
        j = 1;
        while(j > 3) // expression is initially false
        {
            System.out.println("while loop executed");
        }

        do
        {
            System.out.println("do loop executed");
        }while(j > 3); // expression is initially false
        // for loop
        for(int k = 1; k <= 3; k++)
        {
            System.out.println("for loop: k = " + k);
        }

        // ADD ADDITIONAL FUNCTIONALITY HERE:
        for (int count = 1; count < 4; count++) {
            for (int innercount = 0; innercount <= 2; innercount++) {
                System.out.println("outer loop count = " + count);
                System.out.println("Inner loop count = " + innercount);
            }
        }
        int docount = 0;
        int doincrement = 2;
        do {
            System.out.println("Count: " + docount);
            docount = docount + doincrement;
        } while (docount != 10);
        int whilecount = 9;
        int whiledecrement = 3;
        while (whilecount > 0) {
            System.out.println("whilecount = " + whilecount);
            whilecount = whilecount - whiledecrement;
        }
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        // Runs courseinfo method
        CourseInfo.courseinfo();
        SwitchDemo.switchdemo();
    }
}