package Unit5.Day2;

import java.util.ArrayList;

public class Fibbonaci {

    public static void main (String[] args){
        fib(30,0,1);
    }

    public static void fib(int indexMax, int num1, int num2){
        if(indexMax == 1){
            return;
        }
        else{
            System.out.println(num1);
            fib(indexMax-1,num2, num1+num2);
        }

    }
}
