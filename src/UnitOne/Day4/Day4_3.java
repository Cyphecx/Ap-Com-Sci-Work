package UnitOne.Day4;

import java.util.Scanner;

public class Day4_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        int postition = (int)(Math.random() * (100-word.length()));
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 10; k++){
                int pos = i*10 + k;
                if(pos >= postition && pos < postition+word.length()){
                    System.out.print(word.charAt(pos - postition) + " ");
                }
                else {
                    int chara = (int) (Math.random() * 26 + 97);
                    System.out.print((char) (chara) + " ");

                }
            }
            System.out.println();
        }
    }
}
