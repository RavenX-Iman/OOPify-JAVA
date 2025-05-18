package Lab3;
// Encapsulated Account class
class Account {

    // Private data member (Encapsulation)
    private double balance;

    // Default constructor - sets balance to 0
    public Account() {
        balance = 0.0;
    }

    // Parameterized constructor - sets balance to the given value
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // Getter method (accessor)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Runner class to test Account class
public class Task2 {
    public static void main(String[] args) {

        // Creating first account with some balance using parameterized constructor
        Account acc1 = new Account(1000.0);

        // Deposit and withdraw operations
        acc1.deposit(500);
        acc1.withdraw(200);

        System.out.println("Account 1:");
        acc1.displayBalance();

        System.out.println();

        // Creating second account with same balance as acc1 using getBalance()
        Account acc2 = new Account(acc1.getBalance());

        System.out.println("Account 2:");
        acc2.displayBalance();
    }    
}
