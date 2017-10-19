package Unit3.Day7;

        import Unit2.Day1.Rectangle;

        import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rectangles?");
        Rectangle2[] rects = new Rectangle2[scan.nextInt()];
        for (int i = 0; i < rects.length; i++) {
            System.out.println("Enter the area and perimeter for Rectangle #"+ (i+1));
            rects[i] = new Rectangle2(scan.nextDouble(), scan.nextDouble());
        }
        for (Rectangle2 r : rects) {
            System.out.println(r);
        }
        System.out.println("There are " + Rectangle2.getNumRectangles() + " Rectangles");
        System.out.println(Rectangle2.getNumSquares() + " of the Rectangles are Squares");
        System.out.println("The longest side length is: "+ Rectangle2.longestSide(rects).getLarge());
        System.out.println("The largest area is: "+ Rectangle2.getLargestArea());
    }
}
