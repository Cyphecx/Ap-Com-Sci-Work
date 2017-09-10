import java.util.*;
import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter? ");
        int arraySize = scan.nextInt();
        double[] nums = new double[arraySize];
        for(int i = 0; i < arraySize; i++) {
            System.out.println("Enter number #" + (i + 1));
            double input = scan.nextDouble();
            nums[i] = input;
        }
        Arrays.sort(nums);
        System.out.println("The median value is: "+nums[nums.length/2]);
    }
}
