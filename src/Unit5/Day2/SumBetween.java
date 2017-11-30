package Unit5.Day2;

import java.util.Scanner;

public class SumBetween {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers");
        int one = scan.nextInt();
        int two = scan.nextInt();
        System.out.println("The sum of all integers inbetween and including are");
        if(one > two){
            int temp = one;
            one = two;
            two = temp;
        }
        System.out.println(sum(one, two));
    }

    public static int sum(int one, int two){

        if(two - one == 1){
            return one+two;
        }
        if(one == two){
            return one;
        }
        else{
            return  sum(one+1, two-1)+one+two;
        }
    }
}
