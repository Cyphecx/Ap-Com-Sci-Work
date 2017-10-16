package Unit3.Day6;

import java.util.ArrayList;

public class Player {
    private String name = "";
    private int number = 0;
    private ArrayList<Shot> shots = new ArrayList<Shot>();
    private int[][] stats = new int[3][2];
    private int numShots = 0;

    public Player(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getAttemptedShots(int type){
        return stats[type][0];
    }

    public int getSuccessfulShots(int type){
        return stats[type][1];
    }

    public double getAverage(int type){
        return (double)(stats[type][1])/(double)(stats[type][0]);
    }

    public int getNumShots() {
        return numShots;
    }

    public ArrayList<Shot> getShots() {
        return shots;
    }

    public void addShot(int type, boolean s){
        shots.add(new Shot(type,s));
        stats[type][0] += 1;
        if(s) {
            stats[type][1] += 1;
        }
    }

    public void printStats(){
        System.out.println(this.toString());
        if(this.getAttemptedShots(0) == 0){
            System.out.println("\tFree throws: "+this.getSuccessfulShots(0) +" out of "+ this.getAttemptedShots(0) +"| 0.0%");
        }
        else{
            System.out.println("\tFree throws: "+this.getSuccessfulShots(0) +" out of "+ this.getAttemptedShots(0) +"| "+ (double)(this.getSuccessfulShots(0)) / (double)(this.getAttemptedShots(0)) +"%");
        }

        if(this.getAttemptedShots(1) == 0){
            System.out.println("\tTwo pointers: "+this.getSuccessfulShots(1) +" out of "+ this.getAttemptedShots(1) +"| 0.0%");
        }
        else{
            System.out.println("\tTwo pointers: "+this.getSuccessfulShots(1) +" out of "+ this.getAttemptedShots(1) +"| "+ (double)(this.getSuccessfulShots(1)) / (double)(this.getAttemptedShots(1)) +"%");
        }

        if(this.getAttemptedShots(2) == 0){
            System.out.println("\tThree pointers: "+this.getSuccessfulShots(2) +" out of "+ this.getAttemptedShots(2) +"| 0.0%");
        }
        else{
            System.out.println("\tThree pointers: "+this.getSuccessfulShots(2) +" out of "+ this.getAttemptedShots(2) +"| "+ (double)(this.getSuccessfulShots(2)) / (double)(this.getAttemptedShots(2)) +"%");
        }
    }
    public String toString(){
        return (this.name +" "+ this.number);
    }
}
