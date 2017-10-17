package Unit3.Day7;

public class Rectangle2 {
    private double area = 0;
    private double perimeter = 0;
    private static int numRectangles = 0;
    private static double largestArea = 0;
    private static double largestPerimeter = 0;
    private static double length = 0;
    private static double width = 0;
    private static int numSquares=0;

    Rectangle2(double x, double y) {
        this.area = x;
        this.perimeter = y;
        if(this.area > largestArea){
            largestArea = this.area;
        }

        if(this.perimeter > largestPerimeter){
            largestPerimeter = this.perimeter;
        }

        this.numRectangles++;
        double a = 1;
        double b = (-1/2)*this.perimeter;
        double c = this.area;
        double descriminent = b*b - 4*a*c;
        if(descriminent == 0){
            numSquares++;
        }
    }

    double getSmall() {

    }

    double getLarge() {

    }

    static Rectangle2 longestSide(Rectangle2 [] rec) {

    }

    public String toString() {

    }

}
