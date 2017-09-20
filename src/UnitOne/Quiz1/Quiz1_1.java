package UnitOne.Quiz1;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1_1 {
    public static void main(String[] args){
        ArrayList<Integer> p = new ArrayList<>();
        int[] primes = new int[9999999];
        for(int i = 0; i < primes.length; i++){
            primes[i] = i;
        }
        for(int i = 2; i < primes.length; i++){
            if(primes[i] != 0){
                for(int k = 2; k*i < primes.length; k++){
                    primes[k*i] = 0;
                }
            }
        }
        for(int i = 2; i < primes.length; i++){
            if(primes[i] != 0) {
                p.add(primes[i]);
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Which prime do you want?");
        int prime = scan.nextInt();
        System.out.println("The " + prime + "nth prime is: " + p.get(prime-1));
    }

}
