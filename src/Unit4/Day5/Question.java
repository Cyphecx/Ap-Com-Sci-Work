package Unit4.Day5;

import java.util.ArrayList;

public class Question
{
    private String question;// a String of what the question was, for example: “43 + 59”
    private int correct;// the correct answer
    private boolean gotIt = false;// true if the question was eventually answered correctly, false otherwise
    private int response;
    private double time;// time that it took to answer the question on the first try, use System.currentTimeMillis()

    public Question(int num1, int num2){
       this.question = num1 + " + " + num2;
       this.correct = num1 + num2;

    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public boolean GotIt() {
        return gotIt;
    }

    public void setResponse(int response) {
        this.response = response;
    }

    public int getResponse() {
        return response;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getQuestion() {
        return question;
    }

    public int getCorrect() {
        return correct;
    }

    @Override
    public String toString() {
        return question + " = " + correct;
    }
}

