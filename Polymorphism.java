class Vehicle {

    
    void info() {
        System.out.println("This is a vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }
    
    void infoModel(String model) {
        System.out.println("Model: " + model);
    }

    void info(String brand, int year) {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}


class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h.");
    }
}


class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle runs at 120 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.info();
        v.info("Toyota");
        v.info("Toyota", 2024);
        v.infoModel("Sedan");
        v.speed();

        System.out.println();

        
        v = new Motorcycle();
        v.info();
        v.info("Honda");
        v.info("Honda", 2020);
        v.infoModel("CVR");
        v.speed();
    }
}
