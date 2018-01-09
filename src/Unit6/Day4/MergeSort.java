package Unit6.Day4;

public class MergeSort {
    static int comparisons = 0;
    public static void main(String[] args) {
        int avgComparisons = 0;
        for (int x = 0; x < 10; x++) {
            int[] toSort = new int[10000];
            for (int i = 0; i < toSort.length; i++) {
                toSort[i]= (int)(Math.random()*10000);
            }
            for (int i : toSort) {
                System.out.print(i + "/ ");
            }
            toSort = mergeSort(toSort);
            for (int i : toSort) {
                System.out.print(i + "/ ");
            }
            System.out.println();
            avgComparisons+= comparisons;
            comparisons=0;
        }
        System.out.println(avgComparisons/10);

    }

    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }

        else{
            int[] lowerHalf = new int[array.length/2];
            int[] upperHalf = new int[(int)Math.ceil(array.length/2)];
            for (int i = 0; i < lowerHalf.length; i++) {
                lowerHalf[i] = array[i];
            }
            for (int i = array.length-upperHalf.length; i < array.length; i++) {
                upperHalf[i-(array.length-upperHalf.length)] = array[i];
            }
            return merge(mergeSort(lowerHalf),mergeSort(upperHalf));
        }
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] output = new int[array1.length + array2.length];
        int array1Pos = 0;
        int array2Pos = 0;
        for (int i = 0; i < output.length; i++) {
            comparisons++;
            if(array1Pos == array1.length){
                output[i] = array2[array2Pos];
                array2Pos++;
            }
            else if(array2Pos == array2.length){
                output[i] = array1[array1Pos];
                array1Pos++;
            }
            else if(array1[array1Pos] < array2[array2Pos]){
                output[i] = array1[array1Pos];
                array1Pos++;
            }
            else{
                output[i] = array2[array2Pos];
                array2Pos++;
            }
        }
        return output;
    }



}
