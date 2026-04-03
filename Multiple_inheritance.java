interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

interface InterestBearing {
    void addInterest();
}

class Customer {
    String name;
    int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Customer Name: " + name + ", ID: " + id);
    }
}

class Account implements Bank, InterestBearing {
    private double balance;
    private int accountNumber;
    private double interestRate = 0.05;

    Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + ", New Balance: " + balance);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

public class Multiple_inheritance {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", 12345);
        Account account = new Account(987654, 1000.0);

        customer.displayInfo();
        account.displayAccountInfo();

        account.deposit(500);
        account.withdraw(200);
        account.addInterest();
        account.displayAccountInfo();
    }
}