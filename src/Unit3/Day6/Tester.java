package Unit3.Day6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two team names.");
        Team teamOne = new Team(scan.nextLine());
        Team teamTwo = new Team(scan.nextLine());

        System.out.println("How many players are on the " + teamOne);
        int teamOneSize = scan.nextInt();
        System.out.println("How many players are on the " + teamTwo);
        int teamTwoSize = scan.nextInt();

        Player[] teamOnePlayers = new Player[teamOneSize];
        for (int i = 0; i < teamOnePlayers.length; i++) {
            scan.nextLine();
            System.out.println("Enter "+ teamOne +" player #" + (i+1) + "'s name and jersey number");
            teamOnePlayers[i] = new Player(scan.nextLine(), scan.nextInt());
        }
        teamOne.setPlayers(teamOnePlayers);

        Player[] teamTwoPlayers = new Player[teamTwoSize];
        for (int i = 0; i < teamOnePlayers.length; i++) {
            scan.nextLine();
            System.out.println("Enter "+ teamTwo +" player #" + (i+1) + "'s name and jersey number");
            teamTwoPlayers[i] = new Player(scan.nextLine(), scan.nextInt());
        }
        teamTwo.setPlayers(teamTwoPlayers);
        while(true){
            System.out.println("Who took a shot?");
            System.out.println(teamOne);
            int i;
            for(i=0; i < teamOneSize; i++){
                System.out.println("\tPress "+ (i+1) +" for "+ teamOne.getPlayer(i));
            }
            i++;

            System.out.println("\n"+ teamTwo);
            for(int k = 0; k < teamTwoSize; k++){
                System.out.println("\tPress "+ (i+k) +" for "+ teamTwo.getPlayer(k));
            }
            System.out.println("Enter -2 to exit");
            int player = scan.nextInt();
            if(player == -2){
                break;
            }
            System.out.println("How many points was the shot worth and was it successful?");
            if(player < i){
                int type = scan.nextInt()-1;
                boolean successful = scan.nextBoolean();
                teamOne.getPlayer(player-1).addShot(type, successful);
                if(successful){
                    teamOne.addToScore(type+1);
                }
            }
            else{
                int type = scan.nextInt()-1;
                boolean successful = scan.nextBoolean();
                teamTwo.getPlayer(player-i).addShot(type, successful);
                if(successful){
                    teamTwo.addToScore(type+1);
                }
            }
            System.out.println("Score:");
            System.out.println(teamOne +": "+ teamOne.getScore());
            System.out.println(teamTwo +": "+ teamTwo.getScore());
        }
        System.out.println("Final Score: ");
        System.out.println(teamOne +": "+ teamOne.getScore());
        System.out.println(teamTwo +": "+ teamTwo.getScore());
        System.out.println("--------------------------------------------------------------");
        System.out.println(teamOne);
        for (Player p: teamOne.getPlayers()) {
            p.printStats();
        }
        System.out.println("\n"+ teamTwo);
        for (Player p: teamTwo.getPlayers()) {
            p.printStats();
        }
    }
}
