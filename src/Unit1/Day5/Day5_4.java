package Unit1.Day5;

import java.util.ArrayList;

public class Day5_4 {
    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int product = 1;
        int ctr;
        for (ctr = 40000; ctr < Integer.MAX_VALUE; ctr++) {
            factors.clear();
            product = 1;
            factors = primeFactor(ctr);
            for (int i : factors) {
                product *= i;
            }
            System.out.println((factors.size() == 5 && product == ctr) + " " + ctr);
            if (factors.size() == 5 && product == ctr && isPrime(factors)) {
                break;
            }
        }
        System.out.println(ctr);
        System.out.println(factors);
        int n = 1;
        for (int i : factors) {
            n *= i;
        }
        System.out.println(n);
    }

    public static ArrayList<Integer> primeFactor(int in) {
        int m = in;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i < in; i++) {
            if (m % i == 0 && !factors.contains(i)) {
                factors.add(i);
                m /= i;
                i--;
            }
        }
        return factors;
    }

    public static boolean isPrime(ArrayList<Integer>in) {
        for(int x : in){
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}