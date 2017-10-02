package UnitTwo.Quiz;

public class quizCircle {
    double radius;
    double xCenter;
    double yCenter;
    public static int numCircles = 0;

    public quizCircle(){
        numCircles++;
    }

    public quizCircle(double radius, double x, double y){
        this.radius = radius;
        this.xCenter = x;
        this.yCenter = y;
        numCircles++;
    }

    public boolean overlaps(quizCircle a){

        if(Math.sqrt( Math.pow(this.yCenter-a.yCenter, 2) + Math.pow(this.xCenter-a.xCenter, 2)) < this.radius+a.radius){
            return true;
        }
        else{ return false; }
    }
}
