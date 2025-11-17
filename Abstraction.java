abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();
    abstract void gasCapacity();
    abstract void transmission();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}


class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped.");
    }

    void showModel() {
        System.out.println("Model: Toyota Vios 2024");
    }
    
    void gasCapacity() {
        System.out.println("Gas Capacity: 40-liter");
    }
    
    void transmission() {
        System.out.println("Transmission: Automatic Transmission");
    }
}


public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();
        myCar.gasCapacity();
        myCar.transmission();

        
        ((ToyotaVios) myCar).showModel();
    }
}
