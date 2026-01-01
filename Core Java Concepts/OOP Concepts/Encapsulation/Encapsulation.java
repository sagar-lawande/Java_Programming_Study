class BankAccount {
    // Private fields (data hiding)
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accNumber, double initialBalance) {
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // Getter for balance (controlled read)
    public double getBalance() {
        return balance;
    }

    // Setter for deposit with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 5000);

        System.out.println("Current Balance: " + account.getBalance());
        account.deposit(1500);
        account.withdraw(2000);  
        System.out.println("Balance after transactions: " + account.getBalance());
    }
}
















