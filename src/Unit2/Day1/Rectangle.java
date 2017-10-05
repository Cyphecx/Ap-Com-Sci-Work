package Unit2.Day1;

public class Rectangle {
    int length = 0;
    int width = 0;
    String color = "NONE";
    static int numRectangles = 0;

    public Rectangle(){
        numRectangles++;
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public Rectangle(int sideLength){
        this.length = sideLength;
        this.width = sideLength;
        numRectangles++;
    }

    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
        numRectangles++;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return this.length*2 + this.width*2;
    }
    public String toString(){
        return "Length: " + this.length + ", Width: " + this.width + " | Color: " + this.color + " | Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }
}
