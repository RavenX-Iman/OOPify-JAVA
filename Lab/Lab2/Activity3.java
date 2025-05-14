package Lab2;

// Class representing a 2D point with x and y coordinates
class Point { 

    private int x; // x-coordinate of the point
    private int y; // y-coordinate of the point

    // Default constructor
    Point() {
        x = 1; 
        y = 2; 
    } 

    // Parameterized constructor
    Point(int a, int b) {
        x = a; 
        y = b; 
    } 

    // Setter method for x-coordinate
    public void setX(int a) {
        x = a; 
    } 

    // Setter method for y-coordinate
    public void setY(int b) {
        y = b; 
    }  

    // Displays the current coordinates of the point
    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = " + y); 
    } 

    // Moves the point by adding a and b to the current x and y values respectively
    public void movePoint(int a, int b) { 
        x = x + a; 
        y = y + b; 
        System.out.println("x coordinate after moving = " + x + " y coordinate after moving = " + y); 
    } 
} 


public class Activity3 { 

    public static void main(String args[]) { 

         // Creating first Point object using default constructor
        Point p1 = new Point(); 
        
        // Moving p1 by (2, 3)
        p1.movePoint(2, 3); 
        
        // Display updated coordinates of p1
        p1.display(); 

        // Creating second Point object using default constructor
        Point p2 = new Point(); 
        
        // Moving p2 by (2, 3)
        p2.movePoint(2, 3); 
        
        // Display updated coordinates of p2
        p2.display(); 
    } 
}
