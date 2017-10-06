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

    public void setBalance(int balance) {
        this.balance = balance;
        if(balance < 0){
            System.out.println("Balance cannot go below zero: " + balance);
        }
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
