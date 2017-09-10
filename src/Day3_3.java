import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String input = scan.nextLine();
        for(int i = 0; i < input.length(); i++) {
            int rand = (int) (Math.random() * 100);
            for (int j = 0; j < 100; j++) {
                if (j == rand) {
                    System.out.print(input.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
