package UnitOne.Day1;

import java.util.Scanner;

public class Day1_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("# of rows in the Square Array");
        int rows = scan.nextInt();
        int[][] randomNums = new int[rows][rows];
        for(int i = 0; i < randomNums.length; i++){
            for(int k = 0; k < randomNums[i].length; k++){
                if(k == i){
                    randomNums[i][k] = k;
                }
                else {
                    randomNums[i][k] = (int) (Math.random() * 10);
                }
                System.out.print(randomNums[i][k]+" ");
            }
            System.out.println();
        }
    }
}