package Unit6.Day1;

import java.util.Scanner;

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
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to find?");
        System.out.println(binarySearch(nums, scan.nextInt()));
        System.out.println();
    }

    public static void sort(int[] x){
        for (int i = 0; i < x.length-1; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[j] < x[i]){
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
    static int binarySearch (int [] x, int key)
    {
        int lowerBounds = 0;
        int upperBounds = x.length;
        boolean found = false;
        int answer=-1;
        while(!found){
            if(lowerBounds-upperBounds >= 0){
                found = true;
            }
            int midDex = (upperBounds + lowerBounds)/2;

            if(x[midDex] == key){
                if(midDex < answer || answer == -1){
                    answer = midDex;
                }
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
