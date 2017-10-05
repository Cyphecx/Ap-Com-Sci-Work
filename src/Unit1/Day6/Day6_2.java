package Unit1.Day6;

import java.util.*;

public class Day6_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        do{
            System.out.println("Enter two numbers \n");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            int [] trip = triples(num1, num2);
            if(trip != null){
                System.out.println("These numbers are part of a Pythagorean Triple");
                for(int x : trip){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("These numbers are NOT part of a Pythagorean Triple");
            }
        }while(num1 != 0 && num2 != 0);
    }
    public static int[] triples(int x, int y){
        if(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) % 1  == 0){
            int[] out = new int[]{x, y, (int)(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)))};
            Arrays.sort(out);
            return out;
        }
        else if(Math.sqrt(Math.pow(x,2) - Math.pow(y,2)) % 1 == 0){
            int[] out = new int[]{x, y, (int)(Math.sqrt(Math.pow(x,2) - Math.pow(y,2)))};
            Arrays.sort(out);
            return out;
        }
        else  if( Math.sqrt(Math.pow(y,2) - Math.pow(x,2)) % 1 == 0){
            int[] out = new int[]{x, y, (int)(Math.sqrt(Math.pow(y,2) - Math.pow(x,2)))};
            Arrays.sort(out);
            return out;
        }
        else{
            return null;
        }
    }

}
