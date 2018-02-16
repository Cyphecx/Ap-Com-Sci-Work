package Unit8.Day3;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private int averageScore = Integer.MAX_VALUE;
    ;
    private ArrayList<Integer> scores = new ArrayList<Integer>();

    public Student(){}
    public Student(String name, ArrayList<Integer> scoresInput){
        this.name = name;
        this.scores = scoresInput;
        reAverage();
    }
    private void reAverage(){
        int sum = 0;
        for(int i : scores){
            sum+=i;
        }
        averageScore = sum/scores.size();
    }

    public int getAverageScore(){
        return averageScore;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAverageScore() > o.getAverageScore()){
            return 1;
        }
        else if(this.getAverageScore() < o.getAverageScore()){
            return -1;
        }
        return 0;
    }
    public String toString(){
        return name + "| average score: "+averageScore+"; All scores:"+scores.toString();
    }
}
