/*
   Name: Tanner Klock
   File: Automobile.java
   Date: March 28th, 2024
   Description: This is a child class that inherits attributes from the vehicle class
   and adds additional functionality
 */
public class Automobile extends Vehicle {
    private Integer horsepower;
    private String fuelType;

    // Getter methods
    public Integer getHorsepower() {
        return this.horsepower;
    }
    public String getFuelType() {
        return this.fuelType;
    }
    // Setter methods
    public void setHorsepower(Integer horsepowerArg) {
        this.horsepower = horsepowerArg;
    }
    public void setFuelType(String fuelTypeArg) {
        this.fuelType = fuelTypeArg;
    }

    // Automobile constructor
    Automobile(String makeArg, String modelArg, Integer yearArg, String VINArg, Integer horsepowerArg, String fuelTypeArg) {
        // Using the parent class constructor to set the inherited attributes
        super(makeArg, modelArg, yearArg, VINArg);
        // Then setting the new automobile class attributes
        this.setHorsepower(horsepowerArg);
        this.setFuelType(fuelTypeArg);
    }
    @Override public String getVehicleInfo() {
        // Uses parent class method to get formatted string
        String formattedSuper = super.getVehicleInfo();
        // Adds on additional attributes
        String formattedHorsepower = String.format("Power: %d hp", this.getHorsepower());
        String formattedFuelType = String.format("Fuel Type: %s", this.getFuelType());
        // Return fully formatted string
        return String.format(""" 
                %s%s
                %s
                """,
                formattedSuper, formattedHorsepower, formattedFuelType);
    }
}
