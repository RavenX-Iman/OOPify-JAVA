package Lab2;

class Distance {
    public double feet;
    public double inches;

    // No-argument constructor
    Distance() {
        feet = 0.0;
        inches = 0.0;
    }

    // Two-argument constructor
    Distance(double f, double i) {
        feet = f;
        inches = i;
    }

    // Display function
    void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Using no-argument constructor
        Distance d1 = new Distance();
        d1.display();

        // Using two-argument constructor
        Distance d2 = new Distance(5.5, 8.2);
        d2.display();
    }
}
