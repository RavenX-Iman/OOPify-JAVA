package Lab_1;
import java.util.Scanner; 
class CarPart { 
    //properties of the CarPart-class
    private String modelNumber; 
    private String partNumber; 
    private String cost; 

    //setter method
    public void setparameter(String x, String y, String z) { 
        modelNumber = x; 
        partNumber = y; 
        cost = z; 
    } 
 
    public void display() { 
        System.out.println("Model  Number: " + modelNumber + "Part Number: " + partNumber+ "Cost: " + cost); 
    } 
} 
public class CarPartRunner { 
 
    public static void main(String[] args) {
        //scanner object to take input from user 
        Scanner sc = new Scanner(System.in); 
        //declaration of car1 object of CarPart-class
        CarPart car1 = new CarPart(); 
        System.out.println("What is Model Number?"); 
        System.out.println("What is Part Number?"); 
        System.out.println("What is Cost?"); 
        String x = sc.nextLine(); 
        String y = sc.nextLine(); 
        String z = sc.nextLine(); 
        //setting values of properties of car1 object
        car1.setparameter(x, y, z); 
        //displaying values of properties of car1 object
        car1.display();
        sc.close();
}
}
