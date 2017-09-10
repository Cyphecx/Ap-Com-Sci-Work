package Day1;

import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Word");
        String input = scan.nextLine();
        char[] array = input.toCharArray();
        for(int i = array.length-2; i > 0; i--) {
            System.out.print(array[i]);
        }
    }
}
