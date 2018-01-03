package Unit6.Day1;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() *100);
            System.out.print("   |" + (i) + "|. "+ nums[i]);
        }
        System.out.println("Pick a number to find");
        Scanner scan = new Scanner(System.in);
        int findIt = scan.nextInt();
        int index = linearSearch(nums, findIt);
        if(index == -1){
            System.out.println(findIt +" does not exist!");
        }
        else{
            System.out.println(findIt +" is at position " + index);
        }

    }

    static int linearSearch (int [] x, int key) {
        for(int i = 0; i < x.length; i++){
            if(x[i] == key){
                return i;
            }
        }

        return -1;
    }

}
