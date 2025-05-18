package Lab3;
// Encapsulated Student class
class Student {

    // Private data members (Encapsulation)
    private String name;
    private int[] resultArray = new int[5];

    // Parameterized constructor
    public Student(String name, int[] resultArray) {
        this.name = name;

        // Copying array to ensure encapsulation
        for (int i = 0; i < 5; i++) {
            this.resultArray[i] = resultArray[i];
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for result array
    public int[] getResultArray() {
        return resultArray;
    }

    // Method to calculate and return average marks
    public double average() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += resultArray[i];
        }
        return sum / 5.0;
    }

    // Method to display student info
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Marks: " + average());
    }
}


// Runner class to test Student class
public class Task3{

    public static void main(String[] args) {

        // Results for student 1 and 2
        int[] marks1 = {85, 90, 78, 88, 92};
        int[] marks2 = {75, 80, 85, 70, 65};

        // Creating first and second Student objects
        Student s1 = new Student("Ali", marks1);
        Student s2 = new Student("Zara", marks2);

        // Displaying student info
        s1.display();
        s2.display();

        // Compare averages
        if (s1.average() > s2.average()) {
            System.out.println(s1.getName() + " has a higher average.");
        } else if (s2.average() > s1.average()) {
            System.out.println(s2.getName() + " has a higher average.");
        } else {
            System.out.println("Both students have the same average.");
        }

        System.out.println();

        // Creating third student with name of s1 and marks of s2
        Student s3 = new Student(s1.getName(), s2.getResultArray());

        // Displaying third student info
        System.out.println("Third student (Name from s1, Marks from s2):");
        s3.display();
    }
}

