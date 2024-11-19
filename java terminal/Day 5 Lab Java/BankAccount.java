/*
Q1. Design a BankAccount class to simulate basic banking operations.
The class should include the following:
accountNumber,accountHolderName,balance.
Initialize the attributes with or without a starting balance.
Define some operations such as:
deposit(double amount): Adds the specified amount to the account balance.
withdraw(double amount): Deducts the specified amount from the balance if
sufficient funds are available; otherwise, display an appropriate message.
displayAccountInfo(): Displays the account details, including account
number, account holder name, and current balance
*/

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance in your account.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
       
        BankAccount account = new BankAccount();
        
      
        account.accountNumber = 78635628;
        account.accountHolderName = "Kundan Kumar";
        account.balance = 27678.89;

        account.displayAccountInfo();

        account.deposit(2767);

        account.withdraw(2345);

        account.displayAccountInfo();
    }
}
