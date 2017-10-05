package Unit2.Day3;

public class Circle{

    int radius = 0;
    int xCenter = 0;
    int yCenter = 0;
    String color = "";
    static int numCircles = 0;


    public Circle() {
        numCircles++;

    }

    public Circle(int r){
        numCircles++;
        radius = r;

    }

    public Circle(int x, int y, int r){
        numCircles++;
        xCenter = x;
        yCenter = y;
        radius = r;
    }

   public Circle(int x, int y, int r, String c){
        numCircles++;
        xCenter = x;
        yCenter = y;
        radius = r;
        color = c;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public boolean containsPoint(int x, int y){
        if(Math.sqrt(Math.pow(x - this.xCenter, 2) + Math.pow(y - this.yCenter, 2)) < radius){
            return true;
        }
        else {
            return false;
        }
    }
}

