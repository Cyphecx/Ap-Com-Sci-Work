import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int input = scan.nextInt();
        for(int i = 0; i < input; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
