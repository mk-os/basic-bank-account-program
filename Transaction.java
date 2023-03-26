import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() { return this.date; }
    public char getType() { return this.type; }
    public double getAmount() { return this.amount; }
    public double getBalance() { return this.balance; }
    public String getDescription() { return this.description; }
}