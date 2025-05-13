package Lab2;
// by using constructors
class Rectangle2 { 
    public int length, width; 

    // Non-parameterized constructor: assigns default values
    Rectangle2() {
        length = 5; 
        width = 2; 
    } 

    // Parameterized constructor: assigns values provided during object creation
    Rectangle2(int l, int w) {
        length = l; 
        width = w; 
    } 

    // Method to calculate the area of the rectangle
    public int Calculatearea() { 
        return (length * width);
    }
}

public class Activity2  { 
    public static void main(String args[]) { 
        // Creating a Rectangle object using the non-parameterized constructor
        Rectangle2 rect1 = new Rectangle2(); 

        // This will print the area based on default values (5 * 2 = 10)
        System.out.println(rect1.Calculatearea()); 
        


        // Creating another Rectangle object using the parameterized constructor
        Rectangle2 rect2 = new Rectangle2(10, 20); 

        // This will print the area based on provided values (10 * 20 = 200)
        System.out.println(rect2.Calculatearea()); 
    } 
}
