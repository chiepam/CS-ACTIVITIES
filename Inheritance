class Vehicle{
    String brand;
    
    void start () {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String brand;
    String color;
    String seat;
    String fuel;
    
    
    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: " + model);
        System.out.println("Color: "+ color);
        System.out.println("Sea Capacity: "+ seat);
        System.out.println("Fuel: "+ fuel);
    }
}

public class Main {
    public static void main (String[] args) {
        Car myCar = new Car();
        myCar.brand ="Toyota";
        myCar.model = "Vios";
        myCar.color = "Red";
        myCar.seat = "5 people";
        myCar.fuel ="Gasoline";
        
        myCar.start();
        myCar.displayInfo();
    }
}
