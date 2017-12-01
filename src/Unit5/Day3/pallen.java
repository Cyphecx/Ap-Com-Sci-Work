package Unit5.Day3;

import java.util.Scanner;

public class pallen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a prospective pallendrome");
        if(isP(scan.nextLine())){
            System.out.println("Sure is");
        }
        else{
            System.out.println("Falsessss");
        }
    }

    public static boolean isP(String w){
        if(w.length() <=1){
            return true;
        }
        else if(w.charAt(0) == w.charAt(w.length()-1)){
            return isP(w.substring(1,w.length()-1));
        }
        else{
            return false;
        }
    }
}
