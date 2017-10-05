package Unit3.Day2;

public class Account {
    private int balance = 0;
    private String name;

    public Account(String s, int b){
        this.name = s;
        this.balance = b;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + " has a balance of " + this.balance;
    }
}
