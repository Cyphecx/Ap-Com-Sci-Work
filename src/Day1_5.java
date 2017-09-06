import java.util.Scanner;

public class Day1_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int input = scan.nextInt();
        System.out.println(sumUpTo(input));
    }
    public static int sumUpTo(int input){
        for(int i = input-1; i > 0; i--){
            input += i;
        }
        return input;
    }
}
