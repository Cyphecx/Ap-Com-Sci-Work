package Unit4.Day4;

public class Coord extends Object{
    private int x;
    private int y;

    public Coord(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Coord c){
        if(this.x == c.getX() && this.y == c.getY()){
            return true;
        }
        return false;
    }
}
