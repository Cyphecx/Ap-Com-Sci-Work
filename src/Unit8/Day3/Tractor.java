package Unit8.Day3;

public class Tractor extends Vehicle{
    public String getYears(){
        return "20";
    }
    public int getTopSpeed(){
        return 15;
    }
    public String toString(){
        return "Tractor| "+ super.toString();
    }
}
