package Unit3.Day8;

import java.util.Scanner;

public class Dance {
    public static void main(String[] rgs){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many judges?");
        int[] scores = new int[scan.nextInt()];
        System.out.println("Please enter the scores.");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }
        System.out.println("The average score is: " + averageScores(scores));
    }

    static int countOccurences(int[] numbers, int target){
        int occurrences = 0;
        for (int i:numbers) {
            if(i == target){
                occurrences++;
            }
        }
        return occurrences;
    }

    static int[] findMaxAndMin(int[] numbers){
        int maxValue=0;
        int minValue=101;
        for(int i:numbers){
            if(i > maxValue){
                maxValue = i;
            }
            if(i < minValue){
                minValue = i;
            }
        }
        return new int[]{maxValue, minValue};
    }

    static double averageScores(int[] scores){
        double avg = 0;
        if(scores.length < 6){
            for(int i:scores){
                avg+=i;
            }
            avg /= scores.length;
        }
        else{
            int[] maxMin = findMaxAndMin(scores);
            boolean minU = false;
            boolean maxU = false;
            int amountOfNumbers = 0;
            if(countOccurences(scores, maxMin[0]) > 1){
                maxU = true;
            }
            if(countOccurences(scores, maxMin[1]) > 1){
                minU = true;
            }
            for (int i : scores){
                if(!(i == maxMin[0] && !maxU) && !(i == maxMin[1] && !minU)){
                    avg+=i;
                    amountOfNumbers++;
                }
            }
            avg /= amountOfNumbers;
        }
        return avg;
    }
}
