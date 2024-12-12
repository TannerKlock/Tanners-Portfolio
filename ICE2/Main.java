/*
  Name: Tanner Klock
  File: Main.java
  Date: February 23rd, 2024
  Description: Main java class to test and use Student class
 */
public class Main {
    public static void main(String[] args) {
        // Create objects using constuctors
        Student me = new Student();
        Student student2 = new Student("Tanner", 100923930);
        Student student3 = new Student();

        // Set student3's data
        student3.setRollnumber();
        student3.setName();

        // Use getter method to display all object data
        me.getstudentinfo();
        student2.getstudentinfo();
        student3.getstudentinfo();
    }
}
