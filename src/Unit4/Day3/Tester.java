package Unit4.Day3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do{
            System.out.println("1: Roll once\n" +
                               "2: Roll more than once \n" +
                               "3: View previous rolls \n" +
                               "4: View roll distribution  \n" +
                               "5: View most rolled number and %\n" +
                               "6: Longest streak info\n" +
                               "7: Exit");
            input = scan.nextInt();
            scan.nextLine();
            switch(input){
                case 1:
                    System.out.println(Roll.Roll(1));
                    break;
                case 2:
                    System.out.println("How many rolls would you like to make?");
                    System.out.println(Roll.Roll(scan.nextInt()));
                    break;

                case 3:
                    System.out.println(Roll.getRollHistory());
                    System.out.println();
                    break;

                case 4:
                    int[] rolls = Roll.getRolls();
                    for (int i = 0; i < rolls.length; i++) {
                        System.out.println("(" + (i+1) + ")- " + rolls[i]);
                    }
                    System.out.println();
                    break;
                case 5:
                    int largestIndex = 0;
                    int[] rols = Roll.getRolls();
                    for (int i = 1; i < rols.length; i++) {
                        if(rols[largestIndex] < rols[i]){
                            largestIndex = i;
                        }
                    }
                    System.out.println("The most rolled number is " + (largestIndex+1) + " at " + (double)Roll.getRollHistory().size() / rols[largestIndex] + "%\n");
                    break;

                case 6:
                    System.out.println("The longest streak was " + Roll.getLongestStreakLength() + " " + Roll.getLongestStreakNum() + "'s in a row");
                    break;

            }
        }while(input != 7);
    }
}
