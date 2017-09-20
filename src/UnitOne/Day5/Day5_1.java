package UnitOne.Day5;

import java.util.Scanner;

public class Day5_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter integers(type 0 to stop)");
        int input = 1;
        int sum = 0;
        while(input != 0){
            input = scan.nextInt();
            sum = addSum(sum, input);
            System.out.println(sum + "(User)");
        }
        System.out.println(sum);
    }
    public static int addSum(int n1, int n2){
        return n1 + n2;
    }
}
