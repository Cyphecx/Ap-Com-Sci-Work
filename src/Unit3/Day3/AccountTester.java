package Unit3.Day3;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = scan.nextLine();
        System.out.println("Enter a balance:");
        int balance = scan.nextInt();
        Account acc = new Account(name, balance);
        loop:
        while(true){

            System.out.println("1– change name\n" +
                    "2– deposit\n" +
                    "3 – withdraw\n" +
                    "4 - Exit\n");
            System.out.println(acc);
            int sel = scan.nextInt();
            scan.nextLine();
            switch (sel){
                case 1:
                    System.out.println("Enter the new name");
                    String newName = scan.nextLine();
                    acc.setName(newName);
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    int input = scan.nextInt();
                    acc.deposit(input);
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw");
                    int in = scan.nextInt();
                    acc.withdraw(in);
                    break;
                case 4:
                    System.out.println("Bye");
                    break loop;
                default:
                    System.out.println("That number is invalid");
                    continue loop;
            }
        }
        System.out.println(acc.getName() + " has a balance of $" + acc.getBalance());
        System.out.println("Deposits: " + acc.getDeposits());
        System.out.println("Average deposit value: " + acc.avgDeposit());
        System.out.println("Withdrawls:" + acc.getWithdrawls());
        System.out.println("Average withdrawl value: " + acc.avgWithdrawl());

    }
}


