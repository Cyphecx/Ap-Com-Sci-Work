package Unit6.Day6;

import java.util.ArrayList;

public class SSort {
    static int comps = 0;
    public static void main(String[] args) {
        ArrayList<Integer> toSort = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            toSort.add((int)(Math.random()*70+10));
        }
        for (int i : toSort) {
            System.out.print(i +"/ ");
        }
        System.out.println();
        sSort(toSort);
        for (int i : toSort) {
            System.out.print(i +"/ ");
        }
        System.out.println("\n"+comps);
    }

    public static void sSort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < arr.size(); j++) {
                comps++;
                if(arr.get(j) < arr.get(smallestIndex)){
                    smallestIndex = j;
                }
            }
            int temp = arr.get(smallestIndex);
            arr.set(smallestIndex, arr.get(i));
            arr.set(i, temp);
        }
    }
}
