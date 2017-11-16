package Unit4.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class MathStudent
{
    private String name;//student’s name
    private ArrayList<Question> questions;// a record of all of the questions asked.

    public void go(){
        Scanner scan = new Scanner(System.in);
        questions = new ArrayList<Question>();
        name = scan.nextLine();
        System.out.println("type 1 to begin");
        boolean run = false;
        if(scan.nextLine().equals("1")){
            run = true;
        }
        while(run){
            Question currentQ = new Question((int)((Math.random()*100)+1), (int)((Math.random()*100)+1));
            System.out.println(currentQ.getQuestion());
            long timeStarted = System.currentTimeMillis();
            int answer = scan.nextInt();
            if(answer == currentQ.getCorrect()){
                currentQ.setGotIt(true);
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong...");
            }
            currentQ.setTime(System.currentTimeMillis()-timeStarted);
            currentQ.setResponse(answer);
            questions.add(currentQ);
            System.out.println("Enter 1 to continue or 2 to exit");
            int choice = scan.nextInt();
            if(choice == 2) {
                run = false;
            }

        }
    }

    public void summary(){
        int totalTimeOnQuestions = 0;
        int numCorrect = 0;
        Question longestQuestion = new Question(0,0);
        longestQuestion.setTime(0);
        for(Question q: questions){
            System.out.println(q + " | your response was: " + q.getResponse());
            totalTimeOnQuestions += q.getTime();
            if(q.GotIt()){
                numCorrect++;
            }
            if(q.getTime() > longestQuestion.getTime()){
                longestQuestion = q;
            }
        }
        System.out.println("Average time spent on each question: " + (double)totalTimeOnQuestions/1000/questions.size());
        System.out.println("You got " + numCorrect + " out of "+ questions.size() + " correct");
        System.out.println(longestQuestion + " took the most time with: " + longestQuestion.getTime()/1000 + " seconds");
    }
}
