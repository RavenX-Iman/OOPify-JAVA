package theory;
import java.util.Scanner;
public class Book {
    //attributes of book
    private String name;
    private String author;
    private int price;

    //default constructor with no arguments
    Book(){
        name=null;
        author=null;
        price=0;
    }
    void input(){//method to input values
        Scanner sc = new Scanner(System.in); //
        System.out.println("Enter book name: ");
        name=sc.nextLine();
        System.out.println("Enter book author: ");
        author=sc.nextLine();
        System.out.println("Enter book price: ");
        price=sc.nextInt();
        sc.close();
    }
    void display(){ //method to display values
        System.out.println("Book name: "+ name);
        System.out.println("Book author: "+ author);
        System.out.println("Book price: "+ price);
    }
    
    public static void main(String[] args) {
        Book oop = new Book(); //object creation
        oop.input(); //input method called
        oop.display();//display method called
    }
}
