package Lab2;
class Rectangle { 
    //instance variable
    public int length;
    public int width; 

    //instance methods
    public int Calculatearea() { 
    return (length * width); 
    } 
    } 
    //main runner class
    public class Activity1  { 
    public static void main(String args[]) { 
        //creating object(rect) of rectangle class
        Rectangle rect = new Rectangle(); 

          // Assigning values to the object's instance variables
          rect.length = 10; // Assigning value to the 'length' variable of the rect object
          rect.width = 5;   // Assigning value to the 'width' variable of the rect object
  
    // Printing the calculated area of the rectangle
    System.out.println(rect.Calculatearea()); 
    } 
    } 

    

