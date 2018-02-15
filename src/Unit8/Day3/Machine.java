package Unit8.Day3;

public abstract class Machine implements LifeExpectancy{
    public String toString(){
        return "Life Expectancy: "+this.getYears();
    }
}
