package Unit4.Day4;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Circle[] circles = new Circle[]{
                new Circle(new Coord(5,5), 10),
                new Circle(new Coord(-7,3), 5),
                new Circle(new Coord(20,-43), 30),
                new Circle(new Coord(-5,-2), 20)
        };
        System.out.println("All the points contained by c4");
        System.out.println(circles[3].getPoints());

        System.out.println("\nTesting .common");
        System.out.println("c1 common c2?" + circles[0].common(circles[1]));
        System.out.println("c2 common c3?" + circles[2].common(circles[1]));
        System.out.println("c3 common c4?" + circles[2].common(circles[3]));
        System.out.println("c4 common c1?" + circles[0].common(circles[3]));

        System.out.println("\nTesting \"has\" method");
        System.out.println("c1 has (2,2)? " + circles[0].has(new Coord(2,2)));
        System.out.println("c2 has (100, -100) " + circles[1].has(new Coord(100, -100)));
        System.out.println("c3 has (20,20)? " + circles[2].has(new Coord(20, 20)));

        System.out.println("\nc1 has these points in common with c2");
        circles[0].printCommonPoints(circles[1]);

        System.out.println("\nTesting num has for point (0,0)");
        System.out.println(Circle.numHas(new ArrayList<Circle>(Arrays.asList(circles)), new Coord(0,0)));

        System.out.println("\nTesting Circle.overlapping");
        System.out.println(Circle.overlapping(new ArrayList<>(Arrays.asList(circles))) + " circle(s) overlap");
    }
}
