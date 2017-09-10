import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 positive integers.");
        int in1 = scan.nextInt();
        int in2 = scan.nextInt();
        int bl;
        int sl;
        if(in1 > in2){
            bl = in1;
            sl = in2;
        }
        else{
            sl = in1;
            bl = in2;
        }
        for(int i = sl; i > 0; i--){
            if(sl%i == 0&&bl%i == 0){
                System.out.println("The GCF is " + i);
                break;
            }
        }
    }

}
