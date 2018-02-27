package Unit8.Day5;

public class Car extends Mover {
    private int year;
    private String make;

    public Car(int year, String make, int topSpeed){
        super(topSpeed);
        this.year = year;
        this.make = make;
    }

    @Override
    public String toString() {
        return super.toString() + " | Make= "+this.make + " | Year= "+this.year;
    }
}
