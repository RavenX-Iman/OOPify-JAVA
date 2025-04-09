package theory.Assignment2Theory;
// Base class: LibraryUser
class LibraryUser {
    protected String userID;
    protected String name;
    protected String email;

    // Constructor for common attributes
    public LibraryUser(String userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Derived class: Librarian (inherits from LibraryUser)
class Librarian extends LibraryUser {
    private String employeeID;
    private String workShift;

    public Librarian(String userID, String name, String email, String employeeID, String workShift) {
        super(userID, name, email); // Calls the base class constructor
        this.employeeID = employeeID;
        this.workShift = workShift;
    }

    // Overriding displayDetails() to include Librarian-specific attributes
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Work Shift: " + workShift);
    }
}

// Derived class: Member (inherits from LibraryUser)
class Member extends LibraryUser {
    private String membershipID;
    private int borrowedBooksCount;

    public Member(String userID, String name, String email, String membershipID, int borrowedBooksCount) {
        super(userID, name, email);
        this.membershipID = membershipID;
        this.borrowedBooksCount = borrowedBooksCount;
    }

    // Overriding displayDetails() to include Member-specific attributes
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }
}

// Derived class: Guest (inherits from LibraryUser)
class Guest extends LibraryUser {
    private String visitPurpose;

    public Guest(String userID, String name, String email, String visitPurpose) {
        super(userID, name, email);
        this.visitPurpose = visitPurpose;
    }

    // Overriding displayDetails() to include Guest-specific attributes
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Visit Purpose: " + visitPurpose);
    }
}

// Main class to test the implementation
public class LibraryManagementSystem  {
    public static void main(String[] args) {
        // Creating a Librarian object
        Librarian librarian = new Librarian("L001", "Ali", "ali@example.com", "E123", "Morning");
        
        // Creating a Member object
        Member member = new Member("M001", "Bilal", "bilal@example.com", "MEM789", 3);
        
        // Creating a Guest object
        Guest guest = new Guest("G001", "hira", "hira@example.com", "Research");

        // Displaying details of each user
        System.out.println("Librarian Details:");
        librarian.displayDetails();
        
        System.out.println("\nMember Details:");
        member.displayDetails();
        
        System.out.println("\nGuest Details:");
        guest.displayDetails();
    }
}
