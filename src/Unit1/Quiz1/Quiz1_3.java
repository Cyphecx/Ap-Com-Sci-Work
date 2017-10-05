package Unit1.Quiz1;

import java.util.Scanner;

public class Quiz1_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println(isAPallindrome(scan.nextLine()));
        }
    }
    public static boolean isAPallindrome(String pallindrome){
        char[] chars = pallindrome.toCharArray();
        for(int i = 0; i < pallindrome.length()/2; i++){
            if(chars[i] != chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
