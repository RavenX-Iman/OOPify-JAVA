package theory.Assignment2Theory;

// Demonstrating the role of the 'this' keyword in  Oop.
/*Key Uses of the this Keyword
Referring to Instance Variables (Avoiding Name Conflicts)

Calling Another Constructor in the Same Class (Constructor Chaining)

Returning the Current Class Instance

Passing the Current Object as a Parameter to Another Method

Passing the Current Object as an Argument to a Constructor*/
  
//Applying its concept in method implementation.

// 1. Referring to Instance Variables (Avoiding Naming Conflict)
class Student {
    private String name;
    private int age;

    // Constructor using 'this' to differentiate instance variables from parameters
    public Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
}

// 2. Calling Another Constructor in the Same Class (Constructor Chaining)
class Employee {
    private String name;
    private int salary;

    // Constructor with two parameters
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Default constructor calls the parameterized constructor
    public Employee() {
        this("Default Name", 50000); // Calls another constructor in the same class
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// 3. Returning the Current Class Instance (Method Chaining)
class Car {
    private String model;

    public Car setModel(String model) {
        this.model = model; // Assigns instance variable
        return this; // Returns the current object for method chaining
    }

    public void display() {
        System.out.println("Car Model: " + model);
    }
}

// 4. Passing 'this' as an Argument to a Method
class Printer {
    public void print(Student s) {
        System.out.println("Printing Student: " + s.getName()); // Access via getter
    }
}

// 5. Passing 'this' to Another Constructor
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public BookDetails getDetails() {
        return new BookDetails(this); // Passing current object to another class
    }

    public String getTitle() {
        return title;
    }
}

class BookDetails {
    public BookDetails(Book b) {
        System.out.println("Book Title: " + b.getTitle());
    }
}

// Main class to test all examples
public class Main {
    public static void main(String[] args) {
        // 1. Demonstrating 'this' for instance variables
        Student s1 = new Student("Ali", 20);
        s1.display();
        
        // 2. Constructor Chaining
        Employee e1 = new Employee();
        e1.display();
        
        // 3. Method Chaining
        Car car1 = new Car();
        car1.setModel("Toyota").display();
        
        // 4. Passing 'this' as an argument
        s1.display();
        Printer printer = new Printer();
        printer.print(s1);
        
        // 5. Passing 'this' to a constructor
        Book book1 = new Book("Java Programming");
        book1.getDetails();
    }
}
