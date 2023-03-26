import java.util.Date;
import java.util.ArrayList;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000.00, 1.5);
        
        System.out.println("Current balance: " + account.getBalance());
        account.deposit(30);
        System.out.println("Current balance: " + account.getBalance());
        account.deposit(40);
        System.out.println("Current balance: " + account.getBalance());
        account.deposit(50);
        System.out.println("Current balance: " + account.getBalance());
        
        account.withdraw(5);
        System.out.println("Current balance: " + account.getBalance());
        account.withdraw(4);
        System.out.println("Current balance: " + account.getBalance());
        account.withdraw(2);
        System.out.println("Current balance: " + account.getBalance());

        System.out.println("Account holder name: " + account.getName());
        System.out.println("Annual interest rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Transactions:");

        ArrayList<Transaction> transactions = account.getTransactions();
        for (Transaction t : transactions) {
            System.out.println("Transaction date: " + t.getDate());
            System.out.println("Transaction type: " + t.getType());
            System.out.println("Transaction amount: " + t.getAmount());
            System.out.println("Transaction description: " + t.getDescription());
            System.out.println("Current balance: " + t.getBalance());
            System.out.println();
        }
    }
}
