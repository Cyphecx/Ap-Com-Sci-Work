package Unit4.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomWordDel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Please enter five words");
        for (int i = 0; i < 5; i++) {
            words.add(scan.nextLine());
        }

        int size;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).contains("t")){
                words.remove(i);
            }
        }

        ArrayList<Integer> random = new ArrayList<Integer>();
        for (int i = 0; i < words.size(); i++) {
            random.add(i);
        }

        size = random.size();
        for (int i = 0; i < size; i++) {
            int randomNum =(int)(Math.random()*(random.size()-1));
            System.out.println(words.get(random.get(randomNum)));
            random.remove(randomNum);
        }
    }
}
