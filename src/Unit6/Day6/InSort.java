package Unit6.Day6;

import java.util.ArrayList;

public class InSort {
    public static void main(String[] args) {
        ArrayList<Integer> toSort = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            toSort.add((int)(Math.random()*70 +10));
        }
        for (int i :
                toSort) {
            System.out.print(i + "/ ");
        }
        System.out.println();
        insertionSort(toSort);
        for (int i :
                toSort) {
            System.out.print(i + "/ ");
        }
    }

    public static void insertionSort(ArrayList<Integer> arry){
        int comparisons = 0;
        outer:
        for (int i = 0; i < arry.size(); i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arry.get(i) > arry.get(j)){
                    int temp = arry.get(i);
                    arry.remove(i);
                    arry.add(j+1, temp);
                    continue outer;
                }
                comparisons++;
            }
            int temp = arry.get(i);
            arry.remove(i);
            arry.add(0, temp);
        }
        System.out.println(comparisons);
    }
}
