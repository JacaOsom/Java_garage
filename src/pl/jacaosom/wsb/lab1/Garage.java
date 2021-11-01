package pl.jacaosom.wsb.lab1;

public class Garage {
    private String address;
    private int capacity;
    private int numberOfCars = 0;
    private Car[] cars;

    public Garage(){
        address = "unknown";
        capacity = 0;
        cars = null;
    }
    public Garage(String address, int capacity){
        this.address = address;
        this.capacity = capacity;
        cars = new Car[capacity];
    }

    public void EnterTheCar(Car car)
    {
        if(capacity == numberOfCars){
            System.out.println("The garage is full!");
        }
        else {
            cars[numberOfCars] = car;
            numberOfCars++;
        }
    }
    public Car CarOut(){
        if(numberOfCars == 0){
            System.out.println("The garage is empty!");
        }
        else{
            numberOfCars--;
            cars[numberOfCars] = null;
        }
        return cars[numberOfCars];
    }
    public void PrintInfo()
    {
        System.out.println("The garage's address: " + address);
        System.out.println("The garage's capacity: " + capacity);
        System.out.println("Number of cars in the garage: " + numberOfCars);

        for(int i = 0; i < numberOfCars; i++)
        {
            cars[i].PrintInfo();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        cars = new Car[capacity];
    }

}
