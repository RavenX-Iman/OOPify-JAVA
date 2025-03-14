import java.util.Scanner;

class Travel {
    private int kilometers;
    private int hours;

    // Default constructor
    public Travel() {
        this.kilometers = 0;
        this.hours = 0;
    }

    // Method to get user input
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers traveled: ");
        this.kilometers = sc.nextInt();
        System.out.print("Enter hours traveled: ");
        this.hours = sc.nextInt();
        sc.close();
        
    }

    // Method to display travel details
    public void show() {
        System.out.println("Kilometers: " + kilometers + ", Hours: " + hours);
    }

    // Method to add two travel objects
    public Travel add(Travel other) {
        Travel result = new Travel();
        result.kilometers = this.kilometers + other.kilometers;
        result.hours = this.hours + other.hours;
        return result;
    }

    public static void main(String[] args) {
        // Creating and getting data for two Travel objects
        Travel t1 = new Travel();
        System.out.println("Enter details for first travel:");
        t1.get();

        Travel t2 = new Travel();
        System.out.println("Enter details for second travel:");
        t2.get();

        // Display individual travel details
        System.out.println("\nFirst Travel Details:");
        t1.show();
        System.out.println("Second Travel Details:");
        t2.show();

        // Adding travel objects
        Travel t3 = t1.add(t2);
        System.out.println("\nTotal Travel Details (After Addition):");
        t3.show();
    }

}
