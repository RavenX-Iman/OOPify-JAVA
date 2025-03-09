import java.util.Scanner;

class Student {
    private String studentName;
    private String rollNo;
    private int semesterNo;
    private String courseName;
    private int marks;
    private char grade;

    // Default constructor
    public Student() {
        this.studentName = "";
        this.rollNo = "";
        this.semesterNo = 0;
        this.courseName = "";
        this.marks = 0;
        this.grade = 'F';
    }

    // Parameterized constructor
    public Student(String studentName, String rollNo, int semesterNo, String courseName, int marks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.semesterNo = semesterNo;
        this.courseName = courseName;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Method to get student data from user
    public void get_student_data(Scanner sc) {
        System.out.print("Enter student name: ");
        this.studentName = sc.nextLine();

        System.out.print("Enter roll no: ");
        this.rollNo = sc.nextLine();

        System.out.print("Enter semester no: ");
        this.semesterNo = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter course name: ");
        this.courseName = sc.nextLine();

        System.out.print("Enter marks: ");
        this.marks = sc.nextInt();
        sc.nextLine(); // Consume newline

        this.grade = calculateGrade(this.marks);
    }

    // Method to calculate grade based on marks
    private char calculateGrade(int marks) {
        if (marks >= 85) return 'A';
        else if (marks >= 70) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 50) return 'D';
        else return 'F';
    }

    // Method to display student data and grade
    public void display_quiz_grade() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Semester No: " + this.semesterNo);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Marks: " + this.marks);
        System.out.println("Grade: " + this.grade);
        System.out.println(); // New line for better output formatting
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two students using parameterized constructor
        Student student1 = new Student("Ali Ahmed", "SP24-BCS-010-Section (A)", 3, "OOP", 90);
        Student student2 = new Student("Ayesha Khan", "FA23-BSE-011-Section (B)", 4, "Data Structures", 75);

        // Creating one student using default constructor and getting data from user
        System.out.println("Enter student3 data:");
        Student student3 = new Student();
        student3.get_student_data(sc);

        // Displaying grades for all students
        System.out.println("\nStudent Grades:");
        student1.display_quiz_grade();
        student2.display_quiz_grade();
        student3.display_quiz_grade();

        sc.close(); // Closing scanner at the end
    }
}
