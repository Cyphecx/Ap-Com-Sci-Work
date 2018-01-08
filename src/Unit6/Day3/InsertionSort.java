package Unit6.Day3;

public class InsertionSort {
    public static void main(String[] args) {
        int[] toSort = new int[10];
        for (int i = 0; i < toSort.length; i++) {
            toSort[i]= (int)(Math.random()*100);
        }
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }
        System.out.println();
        insertionSort(toSort);
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }
    }

    public static void insertionSort(int[] arry){
        int comparisons = 0;
        outer:
        for (int i = 0; i < arry.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arry[i] > arry[j]){
                    insertAtIndex(arry, i, j+1);
                    continue outer;
                }
                comparisons++;
            }
            insertAtIndex(arry, i, 0);
        }
        System.out.println(comparisons);
    }


    public static void insertAtIndex(int[] arry, int number, int endPos){
        int toMove = arry[number];
        for (int i = number-1; i >= endPos; i--) {
            arry[i+1] = arry[i];
        }
        arry[endPos] = toMove;
    }
}
