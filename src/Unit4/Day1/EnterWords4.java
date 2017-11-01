package Unit4.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterWords4 {

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
        System.out.println("Pick a word to delete");
        String remover = scan.nextLine();
        System.out.println("Pick a word to replace the deleted one with");
        String replacement = scan.nextLine();

        if(list.contains(remover)){
            list.set(list.indexOf(remover), replacement);
        }

        for(String s : list){
            System.out.println(s);
        }
    }

}
