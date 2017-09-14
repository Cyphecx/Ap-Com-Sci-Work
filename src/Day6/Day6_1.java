package Day6;

import java.util.Scanner;

public class Day6_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 or 2 dimensional array?");
        int type = scan.nextInt();
        if(type == 1){
            System.out.println("How many rows?");
            int size = scan.nextInt();
            int[] array = new int[size];
            System.out.println("Enter min and max");
            int min = scan.nextInt();
            System.out.println();
            int max = scan.nextInt();
            randomFill(array, min, max);
            printArray(array);
        }
        if(type == 2){
            System.out.println("How many rows and columns?");
            int rows = scan.nextInt();
            System.out.println();
            int columns = scan.nextInt();
            int[][] array = new int[rows][columns];
            System.out.println("Enter min and max");
            int min = scan.nextInt();
            System.out.println();
            int max = scan.nextInt();
            randomFill(array, min, max);
            printArray(array);
        }
    }
    public static void printArray (int [] x){
        for(int i = 0; i < x.length; i++){
            System.out.println(x);
        }
    }
    public static void printArray (int[][] x){
        for(int i = 0; i < x.length; i++){
            for(int k = 0; k < x[i].length; k++){
                System.out.print(x[i][k] + " ");
            }
            System.out.println();
        }
    }
    public static void randomFill(int [] j, int min, int max){
        for(int i = 0; i < j.length; i++){
            j[i] = (int)(Math.random()*max)+min;
        }
    }
    public static void randomFill(int [][] j, int min, int max){
        for(int i = 0; i < j.length; i++){
            for(int k = 0; k < j[i].length; k++){
                j[i][k] = (int)(Math.random()*max)+min;
            }
        }
    }
}
