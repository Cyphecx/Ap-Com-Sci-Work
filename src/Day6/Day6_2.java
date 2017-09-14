package Day6;

import java.util.Scanner;

public class Day6_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        do{
            System.out.println("Enter two numbers \n");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(triples(num1, num2) == true){
                System.out.println("These numbers are part of a Pythagorean Triple");
            }
            else{
                System.out.println("These numbers are NOT part of a Pythagorean Triple");
            }
        }while(num1 != 0 && num2 != 0);
    }
    public static boolean triples(int x, int y){
        if(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) % 1  == 0 || Math.sqrt(Math.pow(x,2) - Math.pow(y,2)) % 1 == 0 || Math.sqrt(Math.pow(y,2) - Math.pow(x,2)) % 1 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int[] findThird(int q, int w){
        return new int[3];
    }

}
