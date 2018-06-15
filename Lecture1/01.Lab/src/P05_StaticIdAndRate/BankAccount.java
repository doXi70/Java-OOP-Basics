package P05_StaticIdAndRate;

public class BankAccount {
    private static final double DEFAULT_INTEERST = 0.02;

    public static double rate = DEFAULT_INTEERST;
    public static int bankAccountCount = 1;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount++;
    }

    public void setInterestRate(double interestRate) {
        BankAccount.rate = interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterestRate(int years) {
        return this.balance * rate * years;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
