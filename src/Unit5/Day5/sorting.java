package Unit5.Day5;

public class sorting {
    public static void main(String[] args){
        int[] l = new int[]{9,8,7,6,5,4,3,2,1};
        sortArray(l);
        for(int s : l) {
            System.out.println(s);
        }
    }

    public static void sortArray(int[] x){
        int s = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] < x[s]){
                int temp = x[i];
                x[i] = x[s];
                x[s] = temp;
            }
        }
        sortArray(x, 1);
    }
    public static void sortArray(int[] x, int start){
        if(start == x.length-1){
            return;
        }
        int s = 0;
        for(int i = start; i < x.length; i++){
            if(x[i] < x[s]) {
                int temp = x[i];
                x[i] = x[s];
                x[s] = temp;
            }
        }
        sortArray(x, start+1);
    }
}
