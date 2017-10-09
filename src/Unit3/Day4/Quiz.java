package Unit3.Day4;

public class Quiz {
    private String topic = "";
    private int score;
    private int totalScore;

    public Quiz(String topic, int score, int totScore){
        this.topic = topic;
        this.score = score;
        this.totalScore = totScore;
    }

    public int getScore(){
        return this.score;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
