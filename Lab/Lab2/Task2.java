package Lab2;
class Account {
    public double balance;
    //non parameterized constructor
    Account(){
        balance=0.0;
        System.out.println("Account created with default constructor.");
        System.out.println("Initial Balance: $" + balance);
    }
    //parameterized constructor 
    Account(double initialbalance){
        if (initialbalance >= 0) {
            balance = initialbalance;
        } else {
            balance = 0;
            System.out.println("Initial balance can't be negative. Setting to 0.");
        }
        System.out.println("Account created with parameterized constructor.");
        System.out.println("Initial Balance: $" + balance);
    }

    //method to deposit:
    public void deposit(double amount){
        //in deposit an amount is added current balance in account
        if (amount>0) {
            balance=balance+amount;
                System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    //method to withdraw:
    public void withdraw(double amount){
        //in withdraw an amount is removed from current balance in account
        if (amount>0 && amount<= balance) {
            balance= balance-amount;
                  System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    // Method to display current balance
    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    
}

public class Task2 {
    public static void main(String[] args) {
        //demonstrating the use of both constructors:

    System.out.println("\n== Using Non-Parameterized Constructor ==");
        Account ac2 = new Account();
        ac2.deposit(100);
        ac2.withdraw(50);
        ac2.showBalance();
    

    System.out.println("== Using Parameterized Constructor ==");
        Account ac1 = new Account(40.8);
        ac1.deposit(125);
        ac1.showBalance();
        ac1.withdraw(23.9);
        ac1.showBalance();

    }
    
}
