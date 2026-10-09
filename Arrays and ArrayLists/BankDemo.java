public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Caylazefa", "Gracia");
        bank.addCustomer("Cayla", "Ario");

        // cust 1 
        Customer customer1 = bank.getCustomer(0);
        Account account1 = new Account(1001);
        customer1.addAccount(account1);
        account1.deposit(500000);
        account1.withdraw(100000);

        // cust 2
        Customer customer2 = bank.getCustomer(1);
        Account account2 = new Account(1002);
        customer2.addAccount(account2);
        account2.deposit(1000000);
        account2.withdraw(300000);

        System.out.println("Total Registered Customers: " + bank.getNumberOfCustomers());
        System.out.println();

        customer1 = bank.getCustomer(0);
        System.out.println("Customer: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Number of Accounts: " + customer1.getNumberOfAccounts());
        System.out.println("Account Number: " + customer1.getAccount(0).getAccountNumber());
        System.out.println("Account Balance: " + customer1.getAccount(0).getBalance());
        System.out.println();

        customer2 = bank.getCustomer(1);
        System.out.println("Customer: " + customer2.getFirstName() + " " + customer2.getLastName());
        System.out.println("Number of Accounts: " + customer2.getNumberOfAccounts());
        System.out.println("Account Number: " + customer2.getAccount(0).getAccountNumber());
        System.out.println("Account Balance: " + customer2.getAccount(0).getBalance());
        
    }
}
