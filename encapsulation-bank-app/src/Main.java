public class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("John Doe", -20000);
        // withdraw a certain amount using withrow method
        acct1.withdraw(200);
        acct1.deposit(100000);
        acct1.withdraw(10000);
        System.out.println(acct1.getBalance());
    }
}
