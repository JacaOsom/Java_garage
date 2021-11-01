package pl.jacaosom.wsb.lab1;

public class Car {
    private String vehicleBrand, model;
    private int numberOfDoors, engineCapacity;
    private double averageFuelConsumption;
    private static int numberOfCars;

    public Car()
    {
        vehicleBrand = "unknown";
        model = "unknown";
        numberOfDoors = 0;
        engineCapacity = 0;
        averageFuelConsumption = 0.0;
        numberOfCars++;
    }
    public Car(String vehicleBrand, String model, int numberOfDoors, int engineCapacity, double averageFuelConsumption){
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.engineCapacity = engineCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
        numberOfCars++;
    }
    private double CalculateFuelConsumption(double routeLength){
        return (averageFuelConsumption * routeLength) / 100.0;
    }
    public double CalculateTheCostOfTheTrip(double routeLength, double fuelCost){
        return CalculateFuelConsumption(routeLength) * fuelCost;
    }
    public void PrintInfo()
    {
        System.out.println("Vehicle Brand: " + vehicleBrand);
        System.out.println("Vehicle model: " + model);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Engine's capacity: " + engineCapacity);
        System.out.println("Average fuel consumption: " + averageFuelConsumption);
    }
    public static void PrintNumberOfCars()
    {
        System.out.println("Number of cars in garage: " + numberOfCars);
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }
}
