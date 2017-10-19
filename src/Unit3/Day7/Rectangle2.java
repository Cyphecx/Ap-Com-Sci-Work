package Unit3.Day7;

public class Rectangle2 {
    private double area = 0;
    private double perimeter = 0;
    private static int numRectangles = 0;
    private static double largestArea = 0;
    private static double largestPerimeter = 0;
    private double length = 0;
    private double width = 0;
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
        double a = 1.0;
        double b = (-(1.0/2.0))*this.perimeter;
        double c = this.area;
        double discriminant = (b*b) - (4.0*a*c);
        System.out.println(discriminant);
        if(discriminant == 0){
            numSquares++;
            this.length = (-b + Math.sqrt(discriminant)) / 2.0;
            this.width = (-b + Math.sqrt(discriminant)) / 2.0;
        }
        else if(discriminant > 0){
            this.length = (-b + Math.sqrt(discriminant)) / 2.0;
            this.width = (-b - Math.sqrt(discriminant)) / 2.0;
        }
        else{
            numRectangles--;
        }
    }

    double getSmall() {
        if(this.length > this.width){
            return this.width;
        }
        else{
            return this.length;
        }
    }

    double getLarge() {
        if(this.length < this.width){
            return this.width;
        }
        else{
            return this.length;
        }
    }

    public static double getLargestArea() {
        return largestArea;
    }

    public static double getLargestPerimeter() {
        return largestPerimeter;
    }

    public static int getNumRectangles() {
        return numRectangles;
    }

    public static int getNumSquares() {
        return numSquares;
    }

    static Rectangle2 longestSide(Rectangle2 [] rec) {
        int indexOfLargestSide = 0;
        for (int i = 0; i < rec.length; i++) {
            if(rec[i].getLarge() > rec[indexOfLargestSide].getLarge()){
                indexOfLargestSide = i;
            }
        }
        return rec[indexOfLargestSide];
    }

    public String toString() {
        return "Short side: "+ this.getSmall() +" Large side: "+ this.getLarge() +" Area: "+ this.area +" Perimeter: "+ this.perimeter;
    }

}
