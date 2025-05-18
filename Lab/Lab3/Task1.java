package Lab3;
// Encapsulated class to store and manage three marks
class Marks {

    // Private data members (Encapsulation)
    private int mark1;
    private int mark2;
    private int mark3;

    // Default constructor
    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    // Parameterized constructor
    public Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Mutator methods (setters)
    public void setMark1(int m1) {
        mark1 = m1;
    }

    public void setMark2(int m2) {
        mark2 = m2;
    }

    public void setMark3(int m3) {
        mark3 = m3;
    }

    // Accessor methods (getters)
    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    // Method to display all marks
    public void displayMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}

public class Task1 {
    // Main class to test the Marks class
    public static void main(String[] args) {

        // Creating object using default constructor
        Marks student1 = new Marks();
        student1.setMark1(85);
        student1.setMark2(90);
        student1.setMark3(78);
        System.out.println("Student 1 Marks:");
        student1.displayMarks();

        System.out.println();

        // Creating object using parameterized constructor
        Marks student2 = new Marks(88, 92, 80);
        System.out.println("Student 2 Marks:");
        student2.displayMarks();
    }

    
}
