package Unit4.Day4;

import java.util.ArrayList;

public class Circle {
    private Coord center;
    private int radius;
    private ArrayList<Coord> points = new ArrayList<Coord>();

    public Circle(Coord c, int r){
        this.center = c;
        this.radius = r;
        this.findPoints();
    }

    private void findPoints(){
        for (int i = -radius; i < radius; i++) {
            for (int j = -radius; j < radius; j++) {
                if(Math.sqrt( Math.pow(i - center.getX(),2) + Math.pow(j - center.getY(), 2)) <= radius){
                    points.add(new Coord(i,j));
                }
            }
        }
    }

    public boolean common(Circle c2){
        for(Coord cs: c2.getPoints()){
            if(this.points.contains(cs)){
                return true;
            }
        }
        return false;
    }

    public boolean has(Coord a){
        if(this.points.contains(a)){
            return true;
        }
        return false;
    }

    public static int numHas(ArrayList<Circle> circles, Coord a){
        int numhas = 0;
        for (Circle c: circles) {
            if(c.has(a)){
                numhas++;
            }
        }
        return numhas;
    }

    public void printCommonPoints(Circle c2){
        for(Coord c : this.points){
            if(c2.getPoints().contains(c)){
                System.out.println(c);
            }
        }
    }

    public static int overlapping(ArrayList<Circle> circles){
        int amountOverlapping = 0;
        for (int i = 0; i < circles.size()-1; i++) {
            for (int j = i+1; j < circles.size(); j++) {
                if(circles.get(i).common(circles.get(j))){
                    amountOverlapping++;
                }
            }
        }
        return amountOverlapping;
    }
    public ArrayList<Coord> getPoints() {
        return points;
    }
}
