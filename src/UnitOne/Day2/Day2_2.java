package UnitOne.Day2;

import java.util.Scanner;

public class Day2_2 {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            System.out.println(input + " " + isPrime(input));
    }
    public static boolean isPrime(int in){
        for(int i = 2; i < in; i++){
            if(in % i ==0){
                return false;
            }
        }
        return true;
    }
}
