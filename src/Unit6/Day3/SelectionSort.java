package Unit6.Day3;

public class SelectionSort {
    public static void main(String[] args) {
        int[] toSort = new int[10];
        for (int i = 0; i < toSort.length; i++) {
            toSort[i]= (int)(Math.random()*100);
        }
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }
        System.out.println();
        selectionSort(toSort);
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }

    }

    public static void selectionSort(int[] arry){
        int comparisons = 0;
        for (int i = 0; i < arry.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arry.length; j++) {
                comparisons++;
                if(arry[j] < arry[smallest]){
                    smallest = j;
                }
            }
            int temp = arry[smallest];
            arry[smallest] = arry[i];
            arry[i] = temp;
        }
        System.out.println(comparisons);
    }
}
