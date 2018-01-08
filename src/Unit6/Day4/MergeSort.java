package Unit6.Day4;

public class MergeSort {
    public static void main(String[] args) {
        int[] toSort = new int[100];
        for (int i = 0; i < toSort.length; i++) {
            toSort[i]= (int)(Math.random()*100);
        }
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }
        toSort = mergeSort(toSort);
        for (int i : toSort) {
            System.out.print(i + "/ ");
        }
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
                System.out.println("\n" + (array.length-upperHalf.length));
                System.out.println(i);
                upperHalf[i-(array.length-upperHalf.length)] = array[i];
            }
            return merge(mergeSort(lowerHalf),mergeSort(upperHalf));
        }
    }

    public static int[] merge(int[] array1, int[] array2){
        System.out.println(array1.length + " " + array2.length);
        int[] output = new int[array1.length + array2.length];
        int array1Pos = 0;
        int array2Pos = 0;
        for (int i = 0; i < output.length; i++) {
            if(array1[array1Pos] < array2[array2Pos]){
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
