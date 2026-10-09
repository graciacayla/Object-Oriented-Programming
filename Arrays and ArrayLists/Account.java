public class Account {
    private double balance;
    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
         else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}
