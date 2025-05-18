package Lab3;
class Circle { 
    // Private variable to store the radius (Encapsulation)
    private int radius; 

    // Default constructor
    Circle() { 
        radius = 7; 
    } 

    // Parameterized constructor - sets radius to the value provided
    public Circle(int r) { 
        radius = r; 
    } 

    // Mutator method (setter) to set the radius
    public void setRadius(int r) { 
        radius = r; 
    } 

    // Accessor method (getter) to get the radius
    public int getRadius() { 
        return radius; 
    } 

    // Method to display the radius of the circle
    public void display() { 
        System.out.println("Radius = " + radius); 
    } 

    // Method to calculate the area of the circle
    public double calculateArea() { 
        return 3.14 * radius * radius; 
    } 

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
} 

public class Activity1 { 

    public static void main(String args[]) { 
        // Create a Circle object using default constructor
        Circle c1 = new Circle(); 
        
        // Set the radius of c1 to 5 using the mutator
        c1.setRadius(5); 

        // Display area and circumference of c1
        System.out.println("Area of Circle 1 is: " + c1.calculateArea()); 
        System.out.println("Circumference of Circle 1 is: " + c1.calculateCircumference()); 

        // Get radius of c1 using accessor
        int r = c1.getRadius(); 

        // Create a second Circle object using parameterized constructor
        Circle c2 = new Circle(r); 

        // Again set the radius of c2 to 5 (redundant in this case)
        c2.setRadius(5); 

        // Display area and circumference of c2
        System.out.println("Area of Circle 2 is: " + c2.calculateArea()); 
        System.out.println("Circumference of Circle 2 is: " + c2.calculateCircumference()); 
    } 
}
