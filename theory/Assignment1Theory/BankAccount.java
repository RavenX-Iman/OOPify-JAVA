package theory.Assignment1Theory;
import java.util.Scanner;

public class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    BankAccount(){
        this.depositorName = "";
        this.accountNumber = "";
        this.accountType = "";
        this.balance = 0;
    }

    // Constructor to initialize the account
    BankAccount(String depositorName, String accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Deposit function
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw function
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance- amount;
            System.out.println("Withdrawal successful!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Display function
    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for account details
        System.out.print("Enter depositor name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNumber = sc.nextLine();

        System.out.print("Enter account type (Savings/Current): ");
        String accType = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Creating BankAccount object
        BankAccount account = new BankAccount(name, accNumber, accType, balance);

        // Deposit operation
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw operation
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final details
        System.out.println("\nFinal Account Details:");
        account.display();

        sc.close();
    }
}
