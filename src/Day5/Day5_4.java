package Day5;

import java.util.ArrayList;

public class Day5_4 {
    public static void main(String[] args){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int output = 0;
        for(int i = 1000; !done(factors); i++) {
            factors.clear();
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    factors.add(k);
                }
            }
            output = i;
        }
        System.out.println(output + " is the Number.");
    }

    public static boolean done(ArrayList<Integer> list){
        if(list.size() == 5){
            for(int i : list){
                for(int k = 2; k < i; k++){
                    if(i%k != 0){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
