package pl.jacaosom.wsb.lab1;

public class Program {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "CLA", 5, 2200, 6.0);
        Car car2 = new Car("Audi", "Q7", 5, 3000, 7.6);

        Garage garage1 = new Garage();

        garage1.setAddress("Garażowa 1 street");
        garage1.setCapacity(1);

        Garage garage2 = new Garage("Garażowa 2 street", 2);

        garage1.EnterTheCar(car1);
        System.out.println("");
        garage1.PrintInfo();
        System.out.println("");
        garage1.EnterTheCar(car2);

        garage2.EnterTheCar(car2);

        garage2.EnterTheCar(car1);
        System.out.println("");
        garage2.PrintInfo();
        System.out.println("");
        garage2.CarOut();

        garage2.PrintInfo();

        garage2.CarOut();
        System.out.println("");
        garage2.CarOut();

        double cost = car2.CalculateTheCostOfTheTrip(200, 5.97);
        System.out.println("Trip's cost: " + cost);

    }
}
