package theory.Assignment3Theory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

// a. Interface defining user role behavior
interface UserRole {
    void login();                // Displays login message
    String accessDashboard();    // Returns dashboard access description
    String getRole();            // Returns role name
}
// b. Student implementation of UserRole
class Student implements UserRole {
    @Override
    public void login() {
        System.out.println("Student login successful.");
    }
    @Override
    public String accessDashboard() {
        return "Access to course materials and grades.";
    }
    @Override
    public String getRole() {
        return "Student";
    }
}


// b. Instructor implementation of UserRole
class Instructor implements UserRole {
    @Override
    public void login() {
        System.out.println("Instructor login successful.");
    }
    @Override
    public String accessDashboard() {
        return "Access to course creation and student progress.";
    }
    @Override
    public String getRole() {
        return "Instructor";
    }
}


// b. Admin implementation of UserRole
class Admin implements UserRole {
    @Override
    public void login() {
        System.out.println("Admin login successful.");
    }
    @Override
    public String accessDashboard() {
        return "Access to system settings and user management.";
    }
    @Override
    public String getRole() {
        return "Admin";
    }
}

public class Question2 {

    // f. Static ArrayList to track login history
    private static ArrayList<UserRole> loginHistory = new ArrayList<>();

    // c, d, e, g Main GUI and event handling demonstrating polymorphism
    public static void main(String[] args) {
        // Create JFrame window
        JFrame frame = new JFrame("User Login Panel");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons for each role
        JButton studentBtn = new JButton("Login as Student");
        JButton instructorBtn = new JButton("Login as Instructor");
        JButton adminBtn = new JButton("Login as Admin");

        // Label to show output messages
        JLabel resultLabel = new JLabel("Click a button to log in.");
        resultLabel.setPreferredSize(new Dimension(350, 50));

        // Event listener for Student button
        studentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserRole user = new Student(); // Polymorphic reference
                user.login();                   // Console login message
                loginHistory.add(user);         // Add to login history
                resultLabel.setText(user.getRole() + ": " + user.accessDashboard()); // Show GUI message
            }
        });

        // Event listener for Instructor button
        instructorBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserRole user = new Instructor();
                user.login();
                loginHistory.add(user);
                resultLabel.setText(user.getRole() + ": " + user.accessDashboard());
            }
        });

        // Event listener for Admin button
        adminBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserRole user = new Admin();
                user.login();
                loginHistory.add(user);
                resultLabel.setText(user.getRole() + ": " + user.accessDashboard());
            }
        });

        // Add buttons and label to the frame
        frame.add(studentBtn);
        frame.add(instructorBtn);
        frame.add(adminBtn);
        frame.add(resultLabel);

        // Show the GUI window
        frame.setVisible(true);
    }
}
