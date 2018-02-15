package Unit8.Day3;

public abstract class Vehicle extends Machine implements Speed{
    public String toString(){
        return super.toString() + " Top Speed: " + this.getTopSpeed();
    }
}
