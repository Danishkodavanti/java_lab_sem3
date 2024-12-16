import java.util.Scanner;

class BankAccount {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    public BankAccount(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Updated balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavAcct extends BankAccount {
    final double INTEREST_RATE = 0.04; // 4% interest rate

    public SavAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * Math.pow(1 + INTEREST_RATE, 1) - balance;
        balance += interest;
        System.out.println("Interest added! Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful! Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CurAcct extends BankAccount {
    final double MIN_BALANCE = 1000.0;
    final double SERVICE_CHARGE = 100.0;

    public CurAcct(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    public void checkMinBalance() {
        if (balance < MIN_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Balance below minimum! Service charge imposed. Updated balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            checkMinBalance();
            System.out.println("Withdrawal successful! Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        SavAcct savingsAccount = new SavAcct("John Doe", 101, 5000.0);
        System.out.println("\nSavings Account:");
        savingsAccount.deposit(1000);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.withdraw(2000);
        savingsAccount.displayBalance();

        
        CurAcct currentAccount = new CurAcct("Jane Doe", 102, 1200.0);
        System.out.println("\nCurrent Account:");
        currentAccount.deposit(500);
        currentAccount.withdraw(100);
        currentAccount.withdraw(2000); 
        currentAccount.displayBalance();

        scanner.close();
        System.out.println("Name:Danish \nUSN:1BM23CS086");
    }
}
