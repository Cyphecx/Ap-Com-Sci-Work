package Day5;

import java.util.ArrayList;

public class Day5_4 {
    public static void main(String[] args){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int ctr = 40000;
        while(factors.size() < 5) {
            ctr++;
            factors.clear();
            for (int i = 2; i < ctr; i++) {
                if (ctr % i == 0 && isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        System.out.println(ctr);
        System.out.println(factors);
    }

    public static boolean isPrime(int in){
        for(int i = 2; i < Math.sqrt(in)+1; i++){
            if(in % i ==0 && i != in){
                return false;
            }
        }
        return true;
    }
}
