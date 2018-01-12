package Unit6.Day4;

public class MergeSort {
    static int comparisons = 0;
    public static void main(String[] args) {
        int avgComparisons = 0;
       // for (int x = 0; x < 10; x++) {
            int[] toSort = new int[]{38,27,43,3,9,82,10};
//            for (int i = 0; i < toSort.length; i++) {
//                toSort[i]= (int)(Math.random()*10000);
//            }
            for (int i : toSort) {
                System.out.print(i + "/ ");
            }
            System.out.println();
            toSort = mergeSort(toSort);
            for (int i : toSort) {
                System.out.print(i + "/ ");
            }
            System.out.println();
            avgComparisons+= comparisons;
            //comparisons=0;
       // }
        System.out.println(comparisons);

    }

    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }

        else{
            int[] lowerHalf = new int[array.length/2];
            int[] upperHalf = new int[(int)(Math.ceil(array.length/2.0))];
            for (int i = 0; i < lowerHalf.length; i++) {
                lowerHalf[i] = array[i];
            }
            for (int i = lowerHalf.length; i < array.length; i++) {
                upperHalf[i-(lowerHalf.length)] = array[i];
            }
            return merge(mergeSort(lowerHalf),mergeSort(upperHalf));
        }
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] output = new int[array1.length + array2.length];
        int array1Pos = 0;
        int array2Pos = 0;
        int array3Pos = 0;

      //  return output;
        while(array1Pos < array1.length && array2Pos < array2.length){
            System.out.println(array1[array1Pos] +" "+array2[array2Pos]);
            comparisons++;
            if(array1[array1Pos] < array2[array2Pos]){
                output[array3Pos] = array1[array1Pos];
                array3Pos++;
                array1Pos++;
            } else{
                output[array3Pos] = array2[array2Pos];
                array3Pos++;
                array2Pos++;
            }
        }
        while(array2Pos < array2.length){
            output[array3Pos] = array2[array2Pos];
            array3Pos++;
            array2Pos++;
        }
        while(array1Pos < array1.length){
            output[array3Pos] = array1[array1Pos];
            array3Pos++;
            array1Pos++;
        }
        return output;
    }



}
