import java.util.Scanner;

public class Day2_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int secretNum = (int)(Math.random()*100);
        boolean guessed = false;
        int guesses = 0;
        while(!guessed){
            System.out.println("Guess a the Number");
            int guess = scan.nextInt();
            if(guess < secretNum){
                System.out.println("Too low. Guess again.");
            }
            else if(guess > secretNum){
                System.out.println("Too high. Guess again.");
            }
            else{
                guessed = true;
            }
            guesses++;
        }
        System.out.println("You guessed the number! It was: "+secretNum + " and it took you " + guesses + " guesses");
    }
}
