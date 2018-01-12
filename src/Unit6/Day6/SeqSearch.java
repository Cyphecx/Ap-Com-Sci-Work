package Unit6.Day6;

import java.util.ArrayList;

public class SeqSearch {
    static int numComp = 0;
    public static void main(String[] args) {
        ArrayList<Integer> toSearch = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            toSearch.add((int)(Math.random()*70 +10));
        }
        for (int i :
             toSearch) {
            System.out.print(i + "/ ");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(i + "/ ");
        }
        System.out.println();
        System.out.println(sequentialSort(toSearch, 30));
        System.out.println(numComp);
    }

    public static int sequentialSort(ArrayList<Integer> in, int target){
        for (int i = 0; i < in.size(); i++) {
            numComp++;
            if(in.get(i) == target){
                return i;
            }
        }
        return -1;
    }
}
