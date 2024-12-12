/*
   Name: Tanner Klock
   File: Vehicle.java
   Date: March 28th, 2024
   Description: Vehicle Class to make a new vehicle object with getter and setter methods
 */
public class Vehicle {
    private String make;
    private String model;
    private Integer year;
    private String VIN;
    // Constants
    public byte VALID_VIN_LENGTH = 17;

    // Constructors
    Vehicle(String makeArg, String modelArg, Integer yearArg, String VINArg) {
        this.setModel(modelArg);
        this.setMake(makeArg);
        this.setYear(yearArg);
        this.setVIN(VINArg);
    }

    // Individual getter methods
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public Integer getYear() {
        return this.year;
    }
    public String getVIN() {
        return this.VIN;
    }
    // Getter method for all the attributes
    public String getVehicleInfo() {
        String formattedVIN = String.format("VIN: %s", this.getVIN());
        String formattedMake = String.format("Make: %s", this.getMake());
        String formattedModel = String.format("Model: %s", this.getModel());
        String formattedYear = String.format("Year: %d", this.getYear());
        return String.format("""
                %s
                %s
                %s
                %s
                """, formattedMake, formattedModel, formattedYear, formattedVIN);
    }

    // Individual setter methods
    public void setMake(String makeArg) {
        this.make = makeArg;
    }
    public void setModel(String modelArg) {
        this.model = modelArg;
    }
    public void setYear(Integer yearArg) {
        this.year = yearArg;
    }
    public void setVIN(String VINArg) {
        this.VIN = VINArg;
    }
}