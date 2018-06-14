package P02_GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setId(1);
        account.deposit(15);
        account.withdraw(5);

        System.out.printf("Account %s, balance %.2f", account, account.getBalance());
    }
}
