package Unit3.Day1;

public class RightTriangle {
    private double leg1;
    private double leg2;

    public RightTriangle(double x, double y){
        this.leg1 = x;
        this.leg2 = y;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public double getHypotenuse(){
        return Math.sqrt( Math.pow(leg1,2) + Math.pow(leg2, 2) );
    }

    public double getArea(){
        return (leg1*leg2)/2;
    }
}
