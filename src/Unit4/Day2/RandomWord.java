package Unit4.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Please enter five words");
        for (int i = 0; i < 5; i++) {
            words.add(scan.nextLine());
        }
        ArrayList<Integer> random = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            random.add(i);
        }
        int size = random.size();
        for (int i = 0; i < size; i++) {
            int randomNum =(int)(Math.random()*(random.size()-1));
            System.out.println(words.get(random.get(randomNum)));
            random.remove(randomNum);
        }
    }
}
