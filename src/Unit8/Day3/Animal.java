package Unit8.Day3;

public abstract class Animal implements LifeExpectancy, Speed{

    public String toString(){
        return "Life Expectancy: "+ this.getYears()+" Top Speed: "+this.getTopSpeed();
    }
}
