package theory.Assignment3Theory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// a. Interface defining user roles
interface UserRole {
    void login();                  
    String accessDashboard();       
    String getRole();               
}

// b. Implementing classes

class Student implements UserRole {
    public void login() {
        System.out.println("Student logged in.");
    }

    public String accessDashboard() {
        return "Access to enrolled courses and assignments.";
    }

    public String getRole() {
        return "Student";
    }
}

class Instructor implements UserRole {
    public void login() {
        System.out.println("Instructor logged in.");
    }

    public String accessDashboard() {
        return "Access to course creation and student submissions.";
    }

    public String getRole() {
        return "Instructor";
    }
}

class Admin implements UserRole {
    public void login() {
        System.out.println("Admin logged in.");
    }

    public String accessDashboard() {
        return "Access to user management and system settings.";
    }

    public String getRole() {
        return "Admin";
    }
}

// c. GUI Main Class
public class Question2LMS_panel {

    // Storing login history
    //private static because: private-To protect the list from being
    // changed accidentally from outside the class
    //static- are not creating an object of LMSControlPanel, 
    //but still want to keep track of all logins — across all button clicks —in one shared list
    private static ArrayList<UserRole> loginHistory = new ArrayList<>();

   public static void main(String[] args) {
    //Creating a window (JFrame) titled "LMS Control Panel"
    JFrame frame = new JFrame("LMS Control Panel");
    frame.setSize(400, 300); 

    // Exit the program when the window is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    // Use FlowLayout to arrange components in a row
    frame.setLayout(new FlowLayout()); 

    // Creating GUI components — three buttons and one label
    JButton studentBtn = new JButton("Login as Student");     // Button for Student login
    JButton instructorBtn = new JButton("Login as Instructor"); // Button for Instructor login
    JButton adminBtn = new JButton("Login as Admin");         // Button for Admin login
    
    JLabel outputLabel = new JLabel("Click a button to login."); // Label to display messages after login
    outputLabel.setPreferredSize(new Dimension(350, 50)); // Set size of label so it doesn't shrink

    //Adding event listeners to handle button clicks using polymorphism

    //Student button action
    studentBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // Create a Student object and store it in a UserRole reference (polymorphism)
            UserRole user = new Student();
            user.login();                           // Show login message (in console)
            loginHistory.add(user);                 // Optional: Add to login history (ArrayList)
            outputLabel.setText(user.getRole() + ": " + user.accessDashboard()); // Show result on GUI
        }
    });

    //Instructor button action
    instructorBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            UserRole user = new Instructor();       // Create Instructor object
            user.login();                           // Show login message (in console)
            loginHistory.add(user);                 // Optional: Add to history
            outputLabel.setText(user.getRole() + ": " + user.accessDashboard()); // Show result on GUI
        }
    });

    //Admin button action
    adminBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            UserRole user = new Admin();            // Create Admin object
            user.login();                           // Show login message (in console)
            loginHistory.add(user);                 // Optional: Add to history
            outputLabel.setText(user.getRole() + ": " + user.accessDashboard()); // Show result on GUI
        }
    });

    //Adding all GUI components to the frame (window)
    frame.add(studentBtn);
    frame.add(instructorBtn);
    frame.add(adminBtn);
    frame.add(outputLabel);

    //Making the frame visible on the screen
    frame.setVisible(true);
}

}

