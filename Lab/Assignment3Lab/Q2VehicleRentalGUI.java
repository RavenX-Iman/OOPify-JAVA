package Assignment3Lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class for the Vehicle Rental Booking System
public class Q2VehicleRentalGUI extends JFrame implements ActionListener {

    // Declare components
    private JLabel nameLabel, vehicleLabel;
    private JTextField nameField;
    private JComboBox<String> vehicleComboBox;
    private JButton bookButton;

    // Constructor to set up GUI components
    Q2VehicleRentalGUI() {
        // Set the title of the window
        setTitle("Vehicle Rental Booking System");

        // Set layout manager
        setLayout(new GridLayout(4, 2, 10, 10));

        // Initialize components
        nameLabel = new JLabel("Enter your name:");
        nameField = new JTextField();

        vehicleLabel = new JLabel("Select vehicle type:");
        String[] vehicles = {"Car", "Bike", "Truck"};
        vehicleComboBox = new JComboBox<>(vehicles);

        bookButton = new JButton("Book Now");

        // Add ActionListener to button
        bookButton.addActionListener(this);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(vehicleLabel);
        add(vehicleComboBox);
        add(new JLabel()); // empty cell
        add(bookButton);

        // Frame settings
        setSize(400, 200);
        setLocationRelativeTo(null); // center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method that is called when the "Book Now" button is clicked
    public void actionPerformed(ActionEvent e) {
        // Gets user inputs
        String name = nameField.getText();
        String vehicleType = (String) vehicleComboBox.getSelectedItem();

        // Checks if name is empty
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Shows confirmation dialog
            JOptionPane.showMessageDialog(this, "Booking Confirmed!\nName: " + name + "\nVehicle: " + vehicleType, "Booking Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        new Q2VehicleRentalGUI(); // Creating an instance of the GUI
    }
}


