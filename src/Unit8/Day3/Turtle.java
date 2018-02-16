package Unit8.Day3;

public class Turtle extends Animal{

    public String getYears() {
        return "100";
    }

    public int getTopSpeed() {
        return 1;
    }
    public String toString(){
        return "Turtle| "+ super.toString();
    }
}
