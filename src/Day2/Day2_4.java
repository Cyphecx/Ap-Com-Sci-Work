package Day2;

import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int input = scan.nextInt();
        for(int i = 0; i < input; i++){
            System.out.print("0");
        }
        for(int i = 0; i < input-2; i++){
            System.out.println();
            System.out.print("0");
            for(int k = 0; k < input-2; k++){
                System.out.print("1");
            }
            System.out.print("0");
        }
        System.out.println();
        for(int i = 0; i < input; i++){
            System.out.print("0");
        }
    }
}
