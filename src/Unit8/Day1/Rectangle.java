package Unit8.Day1;

public class Rectangle extends GeoFig {

    public double length;
    public double width;

    public Rectangle() {

    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getPerimeter() {
        return 2*length + 2*width;
    }

    public double getArea() {
        return length*width;
    }

    public String toString(){
        return "Rectangle| " + super.toString();
    }
}

