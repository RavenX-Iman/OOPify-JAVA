package Lab2;
import java.util.Scanner;
public class Car {
    private String model;
    private String color;
    private int price;
    Car(){
        model=null;
        color=null;
        price=0;
    }
    void input(){
        Scanner In = new Scanner(System.in);
        System.out.println("Enter the model of car:");
        model=In.next();
        System.out.println("Enter the color of car:");
        color=In.next();
        System.out.println("Enter the price of car:");
        price =In.nextInt();
        In.close();
    }
    void display(){
        System.out.println("Car Details:");
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Car c1= new Car();
        c1.input();
        c1.display();
    }
}
