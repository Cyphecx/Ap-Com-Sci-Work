package UnitOne.Day5;

import java.util.Scanner;

public class Day5_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array row count");
        int rows = scan.nextInt();
        System.out.println("Please enter array column count");
        int columns = scan.nextInt();
        int[][] nums = new int[rows][columns];

        for(int i = 0; i < nums.length; i++){
            for(int k = 0; k < nums[i].length; k++){
                System.out.println("Enter an Int");
                nums[i][k] = scan.nextInt();
            }

        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int[] r : nums){
            for(int n : r){
                if(n > max){
                    max = n;
                }
                if(n < min){
                    min = n;
                }
            }
        }
        System.out.println("The range is " + (max - min));
    }
}
