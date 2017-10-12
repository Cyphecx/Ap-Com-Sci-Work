package Unit3.Day6;

public class Team {
    private String name = "?";
    private Player[] players;

    public Team(String name){
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

}
