package UnitOne.Day2;

import java.util.Scanner;

public class Day2_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for(int i  = 0; i < 100; i++) {
            input = swapLetters(input);
        }
        System.out.println(input);
    }
    public static String swapLetters(String in){
        int random = (int)(Math.random()*in.length());
        int random2 = (int)(Math.random()*in.length());
        while(random2 == random){
            random2 = (int)(Math.random()*in.length());
        }
        char[] array = in.toCharArray();
        char temp = array[random];
        array[random] = array[random2];
        array[random2] = temp;
        String output = "";
        for(char a : array) output += a;
        return output;
    }
}
