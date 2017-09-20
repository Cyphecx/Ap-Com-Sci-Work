package UnitOne.Day4;

import java.util.ArrayList;

public class Day4_2 {
    public static void main(String[] args){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int num = 0;
        for(int i = 1; factors.size() < 17; i++) {
            factors.clear();
            for(int k = 1; k < i+1; k++){
                if(i%k == 0){
                    factors.add(k);
                }
            }
            num = i;
        }
        System.out.println("The number is " + num);
        System.out.println("The factors are " + factors);
    }
}
