package Lab_1;
public class Car {
    // Data members
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;
    private int speed;
    private boolean isEngineOn;

    // parameterized Constructor
    public Car(String brand, String model, int year, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.speed = 0;
        this.isEngineOn = false;
    }

    // Function/Method to start the engine
    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    // Method to stop the engine
    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            speed = 0;  // Car stops when engine is off
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    // Method to accelerate
    public void accelerate(int increaseSpeed) {
        if (isEngineOn && fuelLevel > 0) {
            speed += increaseSpeed;
            fuelLevel -= increaseSpeed * 0.1;  // Fuel decreases based on speed increase
            System.out.println("Car accelerated. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate. Engine is off or fuel is empty.");
        }
    }

    // Method to apply brakes
    public void brake(int decreaseSpeed) {
        if (speed > 0) {
            speed -= decreaseSpeed;
            if (speed < 0) speed = 0;  // Speed cannot be negative
            System.out.println("Car slowed down. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Car is already stationary.");
        }
    }

    // Method to refuel the car
    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            if (fuelLevel > 100) fuelLevel = 100;  // Fuel level cannot exceed 100%
            System.out.println("Car refueled. Current fuel level: " + fuelLevel + "%");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Engine Status: " + (isEngineOn ? "On" : "Off"));
    }

    // Main method for testing
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022, 50);
        
        myCar.displayCarInfo();
        myCar.startEngine();
        myCar.accelerate(30);
        myCar.brake(10);
        myCar.refuel(20);
        myCar.stopEngine();
        myCar.displayCarInfo();
    }
}
