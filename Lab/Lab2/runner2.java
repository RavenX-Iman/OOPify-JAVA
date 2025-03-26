package Lab2;
class Rectangle { 
    public int length, width; 
    
    // Default constructor
    public Rectangle() { 
        length = 5; 
        width = 2; 
    } 
    
    // Parameterized constructor
    public Rectangle(int l, int w) { 
        length = l; 
        width = w; 
    } 

    // Method to calculate area
    public int Calculatearea() { 
        return length * width; 
    } 
} 

public class runner2 { 
    public static void main(String args[]) { 
        Rectangle rect = new Rectangle(); 
        System.out.println("Area of default rectangle: " + rect.Calculatearea()); 
        
        Rectangle rect1 = new Rectangle(10, 20); 
        System.out.println("Area of rectangle with given dimensions: " + rect1.Calculatearea()); 
    } 
}
