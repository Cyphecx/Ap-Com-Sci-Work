package Quiz1;

import java.util.Scanner;

public class Quiz1_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int in = 2;
        double questionNumber = 0;
        do{
            num1 = (int)(Math.random()*9+1);
            num2 = (int)(Math.random()*9+1);

            System.out.println(num1 + " + " + num2);
            in = scan.nextInt();
            questionNumber++;
        }while(num1 + num2 == in);
        System.out.println("Incorrect");
        System.out.println("You got " + (questionNumber-1) + " out of " + questionNumber + " correct! " + (((questionNumber-1)/questionNumber)*100) + "%");

    }
}
