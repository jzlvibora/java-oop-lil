public class BankAccount {
   private  String owner;
   private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance,0);
    }

    public double withdraw(double amount){
        if(amount > 0 && amount <=this.balance) {
            this.balance = this.balance-amount;
        }
        return balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            this.balance = this.balance+amount;
        }
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
