package Unit4.Day4;

public class Tester {
    public static void main(String[] args){
        Circle[] circles = new Circle[]{
                new Circle(new Coord(5,5), 10),
                new Circle(new Coord(-7,3), 1),
                new Circle(new Coord(20,-43), 30),
                new Circle(new Coord(-5,-2), 20)
        };
        System.out.println("All the points contained by c4");
        System.out.println(circles[3].getPoints());

        System.out.println("\nTesting .common");
        System.out.println(circles[0].has(new Coord(5,5)));
        System.out.println("c1 common c2?" + circles[0].common(circles[1]));
        System.out.println("c2 common c3?" + circles[2].common(circles[1]));
        System.out.println("c3 common c4?" + circles[2].common(circles[3]));
        System.out.println("c4 common c1?" + circles[0].common(circles[3]));
    }
}
