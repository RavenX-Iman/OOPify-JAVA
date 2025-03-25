package Lab2;

class Rectangle2 { 
    public int length, width; 
    public int Calculatearea() { 
    return (length * width); 
    } 
    } 
    public class runner { 
    public static void main(String args[]) { 
    Rectangle2 rect = new Rectangle2(); 
    rect.length = 10; 
    rect.width = 5; 
    System.out.println(rect.Calculatearea()); 
    } 
    } 
    