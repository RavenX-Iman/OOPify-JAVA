package Lab3;
class Rectangle {

    // Private variables (encapsulation)
    private int length, width;

    // Default constructor - initializes length and width with default values
    public Rectangle() {
        length = 5;
        width = 2;
    }

    // Parameterized constructor - initializes length and width with given values
    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Mutator method to set the length
    public void setLength(int l) {
        length = l;
    }

    // Mutator method to set the width
    public void setWidth(int w) {
        width = w;
    }

    // Accessor method to get the length
    public int getLength() {
        return length;
    }

    // Accessor method to get the width
    public int getWidth() {
        return width;
    }

    // Method to calculate area of the rectangle
    public int area() {
        return length * width;
    }
}
public class Activity2 {
    public static void main(String[] args) {
        // Create Rectangle object using default constructor
        Rectangle rect = new Rectangle();

        // Set custom length and width using mutators
        rect.setLength(5);
        rect.setWidth(10);

        // Display the area of the rectangle
        System.out.println("Area of Rectangle is: " + rect.area());

        // Display the width of the rectangle using accessor
        System.out.println("Width of Rectangle is: " + rect.getWidth());
        // Display the length of the rectangle using accessor
        System.out.println("Length of Rectangle is: " + rect.getLength());
    }
}

