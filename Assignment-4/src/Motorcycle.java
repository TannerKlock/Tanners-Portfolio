/*
   Name: Tanner Klock
   File: Motorcycle.java
   Date: March 28th, 2024
   Description: A class that extends the functionality of the vehicle class for motorcycles
 */
public class Motorcycle extends Vehicle {
    private Integer engineSize;
    private String engineType;
    // Constructor
    Motorcycle(String makeArg, String modelArg, Integer yearArg, String VINArg, Integer engineSizeArg, String engineTypeArg) {
        super(makeArg, modelArg, yearArg, VINArg);
        this.setEngineSize(engineSizeArg);
        this.setEngineType(engineTypeArg);
    }
    // Getter methods
    public Integer getEngineSize() {
        return this.engineSize;
    }
    public String getEngineType() {
        return this.engineType;
    }

    // Setter methods
    public void setEngineSize(Integer engineSizeArg) {
        this.engineSize = engineSizeArg;
    }
    public void setEngineType(String engineTypeArg) {
        this.engineType = engineTypeArg;
    }

    @Override public String getVehicleInfo() {
        String formattedSuper = super.getVehicleInfo();
        String formattedEngineSize = String.format("Engine Size: %d cc", this.getEngineSize());
        String formattedEngineType = String.format("Engine Type: %s-stroke", this.getEngineType());
        return String.format("""
                %s%s
                %s
                """, formattedSuper, formattedEngineSize, formattedEngineType);
    }

}

