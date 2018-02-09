package Unit8.Day1;

public class Square extends GeoFig {

    public double length;

    public Square() {

    }

    public Square(double l) {
        this.length = l;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }

    public String toString(){
        return "Square| " + super.toString();
    }
}

