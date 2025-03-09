package theory.Assignment1Theory;

public class Int {
    private int value; // Private integer variable

    // Constructor to initialize to 0
    public Int() {
        this.value = 0;
    }

    // Constructor to initialize to a specific int value
    public Int(int value) {
        this.value = value;
    }

    // Method to display the value
    public void display() {
        System.out.println(value);
    }

    // Method to add two Int values and return a new Int object
    public Int add(Int other) {
        return new Int(this.value + other.value);
    }

    public static void main(String[] args) {
        // Creating one uninitialized Int object
        Int result = new Int(); // Initially 0

        // Creating two initialized Int objects
        Int num1 = new Int(30);
        Int num2 = new Int(170);

        // Adding num1 and num2, storing result in result object
        result = num1.add(num2);

        // Displaying the result
        System.out.print("Sum: ");
        result.display();
    }
}

