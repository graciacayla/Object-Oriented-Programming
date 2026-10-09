public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers++] = new Customer(f, l);
        }
        else {
            System.out.println("Cannot add more customers");
        }
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        } else {
            return null;
        }
    }
}   
