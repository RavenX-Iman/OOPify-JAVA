package Lab_1;
public class Rectangle {
    // Data members
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to set new dimensions
    public void setDimensions(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
            System.out.println("Rectangle dimensions updated.");
        } else {
            System.out.println("Invalid dimensions. Length and width must be positive.");
        }
    }

    // Method to display rectangle details
    public void displayRectangleInfo() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);

        rect.displayRectangleInfo();
        rect.setDimensions(15, 7);
        rect.displayRectangleInfo();
    }
}
