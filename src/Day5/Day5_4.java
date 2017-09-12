package Day5;

import java.util.ArrayList;

public class Day5_4 {
    public static void main(String[] args){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int ctr = 20000;
        while(factors.size() < 5){
            ctr++;
            System.out.println(ctr);
            factors.clear();
            for(int i = 2; i < ctr; i++){
                if(ctr % i == 0 && isPrime(i)){
                    factors.add(i);
                }
            }

        }
        System.out.println(ctr);
    }

    public static boolean isPrime(int in){
        for(int i = 2; i < Math.sqrt(in); i++){
            if(in % i ==0){
                return false;
            }
        }
        return true;
    }
}
