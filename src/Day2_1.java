import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();
        String output = "";
        for(int i = 1; i <= input; i++){
            if(input % i == 0){
                output += " " + i;
            }
        }
        System.out.println(output);
    }
}
