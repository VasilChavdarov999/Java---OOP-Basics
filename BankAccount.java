public class BankAccount {

    private int id;
    private double balance;
    public BankAccount(){

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("Account ID%d, balance %.2f", this.getId(), this.getBalance());
    }


}
