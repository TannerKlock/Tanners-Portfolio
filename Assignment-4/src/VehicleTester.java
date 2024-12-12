/*
   Name: Tanner Klock
   File: VehicleTester.java
   Date: March 28th, 2024
   Description: This class will be used to test the Vehicle object class and its child classes
 */

public class VehicleTester {
    public static void main(String[] Args) {
        Vehicle ford = new Vehicle("Ford", "Mustang", 2007, "1F4GFDYRXGS324567");
        Motorcycle honda = new Motorcycle("Honda", "Shadow", 2004, "JH2RC040XBM200124", 750, "4");
        Automobile chevy = new Automobile("Chevy", "Corvette", 1975, "1G4EDYR2XAS123456", 254, "unleaded");
        System.out.println(ford.getVehicleInfo());
        System.out.println(honda.getVehicleInfo());
        System.out.println(chevy.getVehicleInfo());
        Vehicle[] garage = new Vehicle[3];
        garage[0] = ford;
        garage[1] = honda;
        garage[2] = chevy;
        for (int i = 0; i < garage.length; i++) {
            System.out.println(garage[i].getVehicleInfo());
        }
    }
}
