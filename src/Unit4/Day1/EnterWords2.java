package Unit4.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterWords2 {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        String word = "";
        while(!word.equals("exit")){
            if(word.length()>0){
                list.add(word);
            }
            word = scan.nextLine();
        }

        for(String s : list){
            System.out.println(s);
        }
    }

}
