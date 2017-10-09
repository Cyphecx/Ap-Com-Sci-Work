package Unit3.Day3;

public class Account {
    private int balance = 0;
    private String name;
    private int withdrawls = 0;
    private int amountWithdrawn = 0;
    private int deposits = 0;
    private int amountDeposited = 0;

    public Account(String s, int b){
        this.name = s;
        this.balance = b;
        this.deposits++;
        this.amountDeposited = b;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        this.balance += amount;
        deposits++;
        amountDeposited+=amount;
    }
    public void withdraw(int amount){
        if(this.balance - amount < 0){
            System.out.println("Balance cannot go below zero: " + amount);
            return;
        }
        withdrawls++;
        amountWithdrawn+=amount;
        this.balance -= amount;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeposits() {
        return deposits;
    }

    public double avgDeposit(){
        return (double)(this.amountDeposited)/(double)(this.deposits);
    }

    public int getWithdrawls() {
        return withdrawls;
    }

    public double avgWithdrawl(){
        return (double)(this.amountWithdrawn)/(double)(this.withdrawls);
    }

    public String toString(){
        return this.name + " has a balance of " + this.balance;
    }
}
