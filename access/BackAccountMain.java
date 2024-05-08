package access;

public class BackAccountMain {
    public static void main(String[] args) {
        BackAccount account = new BackAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
        account.deposit(-1999);
        account.withdraw(10000);
    }
}
