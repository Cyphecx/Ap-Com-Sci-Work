package Unit4.Quiz1;
import java.util.ArrayList;
import java.util.Scanner;
public class Tester
{
    public static void main (String [] args)
    {
        Scanner input  = new Scanner (System.in);
        ArrayList<Integer> x = new ArrayList<>();
        int w = 0;
        while (w == 0)
        {
            System.out.println("Enter 1 to flip 1 coin.");
            System.out.println("Enter 2 to flip multiple coins.");
            System.out.println("Enter 3 to remove the most recent x flips.");
            System.out.println("Enter 4 to clear the list.");
            System.out.println("Enter 5 to give distribution of heads/tails.");
            System.out.println("Enter 6 to indicate the longest streak and how many times it occurs.");

            int sel = input.nextInt();

            if (sel ==1)
            {
                x.add((int)(Math.random()*2));
            }

            if (sel==2)
            {
                System.out.println("Enter the number of coins.");
                int numCoin = input.nextInt();
                for (int i = 0; i < numCoin; i++) {
                    x.add((int)(Math.random()*2));
                }
            }

            if (sel ==3)
            {
                System.out.println("How many flips would you like to remove?");
                int numFlip = input.nextInt();
                for (int i = 0; i < numFlip; i++) {
                    x.remove(x.size()-1);
                }
            }

            if (sel ==4)
            {
                x.clear();
            }

            if (sel ==5)
            {
                int heads = 0;
                int tails = 0;
                for(int i:x){
                    if(i == 0){
                        heads++;
                    }
                    else{
                        tails++;
                    }
                }
                System.out.println(heads +" Heads, "+ tails +" Tails");
            }

            if (sel ==6)
            {
                int streakLength = 1;
                int maxStreakLength = 0;
                int maxStreakQuantity = 0;
                int lastNum = x.get(0);
                for (int i = 1; i < x.size(); i++) {
                    if(x.get(i) == lastNum){
                        streakLength++;
                    }
                    else if(streakLength>maxStreakLength){
                        maxStreakLength = streakLength;
                        streakLength=1;
                    }
                    else if(streakLength == maxStreakLength){
                        maxStreakQuantity++;
                        streakLength=1;
                    }
                }

                System.out.println("The largest streak was of length "+ maxStreakLength +". There were "+ maxStreakQuantity +" of these streaks.");

            }
            String print = "";
            for (int i : x){
                print += i+" ";
            }
            System.out.println(print);
        }
    }
}

