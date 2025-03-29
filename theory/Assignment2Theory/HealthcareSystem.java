package theory.Assignment2Theory;
// Implementing encapsulation on Patient class
class Patient {
    private String patientID;
    private String name;
    private int age;
    private String medicalHistory;
    private String prescriptions;

    // Constructor
    public Patient(String patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Available"; // Default values
        this.prescriptions = "Not Available";
    }

    // Public method to update name and age (accessible by the patient)
    public void updatePersonalInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to allow authorized doctors to update medical records
    public void updateMedicalRecord(String newMedicalHistory, String newPrescriptions) {
        this.medicalHistory = newMedicalHistory;
        this.prescriptions = newPrescriptions;
    }

    // Public method to display patient details (excluding sensitive information)
    public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Public method for authorized access to medical history and prescriptions
    public void displayMedicalRecord() {
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Prescriptions: " + prescriptions);
    }
}

// Main class to demonstrate encapsulation
public class HealthcareSystem {
    public static void main(String[] args) {
        // Creating a Patient object
        Patient patient1 = new Patient("P123", "Ali Khan", 30);
        
        // Displaying general patient info
        patient1.displayPatientInfo();
        
        // Updating personal details (allowed for the patient)
        patient1.updatePersonalInfo("Ali Raza", 31);
        System.out.println("\nAfter Updating Personal Info:");
        patient1.displayPatientInfo();
        
        // Updating medical records (only authorized doctors should do this)
        patient1.updateMedicalRecord("Diabetes, Hypertension", "Metformin, Amlodipine");
        System.out.println("\nMedical Record Updated:");
        patient1.displayMedicalRecord();
    }
}
