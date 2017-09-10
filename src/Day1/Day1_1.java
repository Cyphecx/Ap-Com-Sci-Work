package Day1;

import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int input = scan.nextInt();
        for(int i = 1; i < input; i+=2){
            System.out.print(i+" ");
        }
    }
}
