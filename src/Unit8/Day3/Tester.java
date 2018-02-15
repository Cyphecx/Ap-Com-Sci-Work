package Unit8.Day3;

public class Tester {
    public static void main(String[] args) {
        Object[] animalsandmachines = new Object[]{new Hare(), new Turtle(), new Car(), new Tractor(), new Refrigerator(), new Oven()};
        for(Object o : animalsandmachines){
            System.out.println(o);
        }
    }
}
