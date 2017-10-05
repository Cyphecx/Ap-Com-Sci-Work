package Unit1.Day1;

import java.util.Scanner;

public class Day1_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("# of rows");
        int rows = scan.nextInt();
        System.out.println("# of columns");
        int columns = scan.nextInt();
        int[][] randomNums = new int[rows][columns];
        for(int i = 0; i < randomNums.length; i++){
            for(int k = 0; k < randomNums[i].length; k++){
                randomNums[i][k] = (int) (Math.random()*10);
                System.out.print(randomNums[i][k]+" ");
            }
            System.out.println();
        }
    }
}
