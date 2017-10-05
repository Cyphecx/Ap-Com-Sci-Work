package Unit1.Day5;

import java.util.*;

public class Day5_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many doubles are you entering?");
        int size = scan.nextInt();
        double[] dubs = new double[size];
        for(int i = 0; i < size; i++){
            dubs[i] = scan.nextDouble();
        }
        reverseArray(dubs);
        for (double x : dubs) {
            System.out.println(x);
        }
    }

    public static void reverseArray(double[] x){
        for(int i = 0; i < (x.length/2); i++){
            double temp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = temp;
        }
    }
}
