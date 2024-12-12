/*
 Name: Tanner klock
 File: Student.java
 Date: February 23rd, 2024
 Description: This class creates a student object to store the roll number and names of individual students
 */
// Imports
import java.util.*;
public class Student {
  // Class attributes
  Scanner input = new Scanner(System.in);
  boolean set = false;
  private String name;
  private int rollnumber;
  // No parameter constructor
  Student() {
      name = "Klock";
      rollnumber = 100923929;
  }
  // Parameterized constructor
  Student(String n, int r) {
      name = n;
      rollnumber = r;
  }

  // Getter method that displays object information
  public void getstudentinfo() {
        System.out.println(this + " Student Info");
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollnumber);
  }
  // Setter methods
  public void setRollnumber() {
      // Boolean variable to determine if datas been set
      set = false;
      while (!set) {
          System.out.println("Please enter the rollnumber of the student: ");
          // Try to save as int data type
          try {
              this.rollnumber = input.nextInt();
              set = true;
          // Get new input if it isn't int data type
          } catch (InputMismatchException e) {
              System.out.println("Please enter a whole number");
              input.next();
          }
      }
  }
  public void setName() {
      set = false;
      while (!set) {
          System.out.println("Please enter the students name: ");
          try {
              this.name = input.next();
              set = true;
          } catch (InputMismatchException e) {
              System.out.println("ERROR: Invalid input");
              input.next();
          }
      }
  }

}
