package Unit6;

public class Binary {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() *100);
        }
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("   |" + (i) + "|. "+ nums[i]);
        }
    }

    public static void sort(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                if(x[j] < x[i]){
                    System.out.println(x[i]);
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    break;
                }
            }
        }
    }
    static int binarySearch (int [] x, int key)
    {
        int lowerBounds = 0;
        int upperBounds = x.length;
        boolean found = false;
        while(!found){
            if(lowerBounds-upperBounds >= 0){
                found = true;
            }
            int midDex = (upperBounds + lowerBounds)/2;

            if(x[midDex] == key){
                return midDex;
            }
            else if(x[midDex] < key){
                lowerBounds = midDex+1;
            }
            else{
                upperBounds /= 2;
            }
        }
        return -1;
    }

}
