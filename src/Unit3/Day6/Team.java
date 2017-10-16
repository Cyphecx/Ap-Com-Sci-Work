package Unit3.Day6;

public class Team {
    private String name = "?";
    private Player[] players;
    private int score = 0;

    public Team(String name){
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }
    public Player getPlayer(int index){
        return players[index];
    }
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getScore(){
        return score;
    }

    public void addToScore(int score) {
        this.score += score;
    }

    public String toString() {
        return name;
    }

}
