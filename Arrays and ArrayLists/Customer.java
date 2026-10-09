import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public Customer(String f, String l) {
        firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        } else {
            return null;
        }
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }
}