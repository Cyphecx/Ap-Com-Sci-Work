package Unit8.Day1;

public class Circle extends GeoFig {

    public double radius;

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return "Circle| " + super.toString();
    }
}

