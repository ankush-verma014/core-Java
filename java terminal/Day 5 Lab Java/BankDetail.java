class BankDetail {
    String accHolderName;
    double balance;
    long accNumber;
    boolean transaction;

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            transaction = true;
            sendMessage(transaction, amt);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    public void deposit(double amt) {
        balance += amt;
        transaction = false;
        sendMessage(transaction, amt);
    }

    public void sendMessage(boolean transaction, double amt) {
        if (transaction) {
            System.out.println(amt + " has been withdrawn successfully");
        } else {
            System.out.println(amt + " has been deposited to the account successfully");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
       
        BankDetail account = new BankDetail();
        
      
        account.accHolderName = "Ankush Verma";
        account.accNumber = 64789256638L;
        account.balance = 3456.0;

        account.displayAccountInfo();

        account.deposit(1000.0);

        account.withdraw(500.0);

        account.displayAccountInfo();
    }
}
