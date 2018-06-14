package P02_GettersAndSetters;

public class BankAccount {
    public int id;
    public double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            this.balance += amount;
        }
        throw new UnsupportedOperationException("Amount can't be below zero.");
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            balance -= amount;
        }

        throw new UnsupportedOperationException("You don't have enought balance.");
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
