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

}
