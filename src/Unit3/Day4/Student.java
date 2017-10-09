package Unit3.Day4;

public class Student {
    private String name = "";
    private Quiz[] quizzes;
    private int quizzesFilled = 0;
    public Student(String name, int quizCount){
        this.name = name;
        this.quizzes = new Quiz[quizCount];
    }

    public String getName() {
        return name;
    }

    public Quiz getQuiz(int index){
        return quizzes[index];
    }
    public void addQuiz(String topic, int score, int totalPoints){
        quizzes[quizzesFilled] = new Quiz(topic, score, totalPoints);
        quizzesFilled++;
    }
    public double quizAverage(){
        double points = 0;
        double totalEarnablePoints = 0;
        for (Quiz q:quizzes) {
            points+=q.getScore();
            totalEarnablePoints+=q.getTotalScore();
        }
        return (points/totalEarnablePoints) * 100;
    }
}