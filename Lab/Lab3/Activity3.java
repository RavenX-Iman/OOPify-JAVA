package Lab3;
// Class to represent a Point in 2D space
class Point {

    // Private data members (encapsulation)
    private int x;
    private int y;

    // Default constructor - sets coordinates to (0, 0)
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor - sets coordinates to (a, b)
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    // Mutator method to set x coordinate
    public void setX(int a) {
        x = a;
    }

    // Mutator method to set y coordinate
    public void setY(int b) {
        y = b;
    }

    // Accessor method to get x coordinate
    public int getX() {
        return x;
    }

    // Accessor method to get y coordinate
    public int getY() {
        return y;
    }

    // Method to display the coordinates
    public void display() {
        System.out.println("x coordinate = " + x + ", y coordinate = " + y);
    }

    // Method to move the point by (a, b)
    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }
}

// Main class to test the Point class
public class Activity3 {

    public static void main(String[] args) {
        // Create a Point object using default constructor
        Point p1 = new Point();
        p1.setX(10);  // Set x to 10
        p1.setY(7);   // Set y to 7
        p1.display(); // Display coordinates of p1

        // Create another Point object using parameterized constructor
        Point p2 = new Point(10, 11);
        p2.movePoint(2, 3); // Move point by (2, 3)
        p2.display();       // Display updated coordinates of p2
    }
}


    

