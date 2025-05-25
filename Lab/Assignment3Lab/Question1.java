package Assignment3Lab;

import java.util.ArrayList;

// Interface for all vehicles
interface Vehicle {
    String start();
    String stop();  
    int fuelEfficiency(); 
    String getType();
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    public String start() {
        return "The car starts.";
    }

    public String stop() {
        return "The car stops.";
    }

    public int fuelEfficiency() {
        return 30; 
    }

    public String getType() {
        return "Car";
    }
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {
    public String start() {
        return "The bike starts.";
    }

    public String stop() {
        return "The bike stops.";
    }

    public int fuelEfficiency() {
        return 60; 
    }

    public String getType() {
        return "Bike";
    }
}

// Truck class implementing Vehicle interface
class Truck implements Vehicle {
    public String start() {
        return "The truck starts.";
    }

    public String stop() {
        return "The truck stops.";
    }

    public int fuelEfficiency() {
        return 15; 
    }

    public String getType() {
        return "Truck";
    }
}

// Main class
public class Question1 {
    public static void main(String[] args) {
        // Creating a list of Vehicle type to store all kinds of vehicles
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        // Adding different vehicles to the list
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new Truck());

        // Loop through each vehicle and calling the interface methods
        for (Vehicle v : vehicleList) {
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println(v.start()); // polymorphic call
            System.out.println("Fuel Efficiency: " + v.fuelEfficiency());
            System.out.println(v.stop()); // polymorphic call
        }

        
    }
}
