package Unit4.Day3;

import java.util.ArrayList;

public class Roll {
    private static int[] rolls = new int[6];
    private static ArrayList<Integer> rollHistory = new ArrayList<>();
    private static int streakLength = 0;
    private static int streakNum = 0;
    private static int longestStreakLength = 0;
    private static int longestStreakNum = 0;

    public static ArrayList<Integer> Roll(int howManyRolls){
        ArrayList<Integer> r = new ArrayList<Integer>();

        for (int i = 0; i < howManyRolls; i++) {
            int num = (int)(Math.random()*6) +1;
            rolls[num-1]++;
            r.add(num);
            rollHistory.add(num);
            if(streakLength > longestStreakLength){
                longestStreakLength = streakLength;
                longestStreakNum = streakNum;
            }
            if(streakNum != num){
                streakLength = 0;
                streakNum = num;
            }
            streakLength++;
        }
        return r;
    }

    public static int getLongestStreakLength() {
        return longestStreakLength;
    }

    public static int getLongestStreakNum() {
        return longestStreakNum;
    }

    public static ArrayList<Integer> getRollHistory() {
        return rollHistory;
    }

    public static int[] getRolls() {
        return rolls;
    }
}
