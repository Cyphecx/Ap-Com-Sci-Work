package Unit8.Day5;

public class Dog extends Mover {
    private int age;
    private String name;

    public Dog(int age, String name, int topSpeed){
        super(topSpeed);
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+ "Age= "+this.age +" Name= " + this.name;
    }
}
