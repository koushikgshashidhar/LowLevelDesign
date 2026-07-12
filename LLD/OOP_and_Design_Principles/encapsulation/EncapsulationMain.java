package encapsulation;

/*
 * ENCAPSULATION
 * ------------
 * Encapsulation is like a capsule:
 * - hold data and behavior together,
 * - protect the internal state,
 * - expose only what the outside world should use.
 *
 * Access modifiers are the main tool for encapsulation.
 */
public class EncapsulationMain {

    public static void main(String[] args) {
        System.out.println("=== Encapsulation demo ===");
        BankAccount account = new BankAccount("ACC-1001", 5000);

        System.out.println("Account created with private state hidden inside the class.");
        System.out.println("Account number can be read through a getter: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());

        System.out.println();
        System.out.println("Depositing 1500 using public behavior...");
        account.deposit(1500);
        System.out.println("Balance after deposit: " + account.getBalance());

        System.out.println();
        System.out.println("Withdrawing 2000 using public behavior...");
        boolean success = account.withdraw(2000);
        System.out.println("Withdrawal successful? " + success);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        System.out.println();
        System.out.println("What is hidden?");
        System.out.println("- balance cannot be changed directly from outside the class");
        System.out.println("- validation stays inside the class");
        System.out.println("- the caller only sees safe methods");
    }
}

class BankAccount {
    private final String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return false;
        }
        balance -= amount;
        return true;
    }
}

