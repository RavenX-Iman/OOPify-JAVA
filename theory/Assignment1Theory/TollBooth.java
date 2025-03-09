package theory.Assignment1Theory;

import java.util.Scanner;

public class TollBooth {
    private int totalCars;
    private double totalCash;

    // Constructor initializes both values to 0
    public TollBooth() {
        this.totalCars = 0;
        this.totalCash = 0.0;
    }

    // Function to count a paying car
    public void payingCar() {
        totalCars++;
        totalCash += 0.50;
    }

    // Function to count a non-paying car
    public void nopayCar() {
        totalCars++;
    }

    // Function to display totals
    public void display() {
        System.out.println("\nTotal cars passed: " + totalCars);
        System.out.println("Total cash collected: $" + totalCash);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth booth = new TollBooth();

        System.out.println("Toll Booth Simulation");
        System.out.println("Press 'P' for paying car, 'N' for non-paying car, and press ESC to exit.");

        while (true) {
            System.out.print("Enter choice: ");
            //.trim() removes extra spaces before and after input
            String choice = sc.next().trim(); // Read input without extra newlines

            //equalsignorecase() is used to compare strings without considering case
            if (choice.equalsIgnoreCase("P")) {
                booth.payingCar();
                System.out.println("Paying car counted.");
            } else if (choice.equalsIgnoreCase("N")) {
                booth.nopayCar();
                System.out.println("Non-paying car counted.");
            } else if (choice.equalsIgnoreCase("ESC")) { //esc string is accepted not the key
                booth.display();
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid input! Please enter 'P', 'N', or press ESC to exit.");
            }
        }

        sc.close();
    }
}
