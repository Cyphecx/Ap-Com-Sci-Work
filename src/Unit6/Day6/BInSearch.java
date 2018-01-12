package Unit6.Day6;

import java.util.ArrayList;

public class BInSearch {
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
        SSort.sSort(toSearch);
        System.out.println();
        System.out.println(binarySearch(toSearch, 30));
        System.out.println(numComp);
    }

    public static int binarySearch(ArrayList<Integer> inputArr, int key){
        int start = 0;
        int end = inputArr.size() - 1;
        while (start <= end) {
            numComp++;
            int mid = (start + end) / 2;
            if (key == inputArr.get(mid)){
                numComp++;
                return mid;
            }
            if (key < inputArr.get(mid)) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
