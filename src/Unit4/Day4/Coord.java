package Unit4.Day4;

public class Coord{
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
    public boolean equals(Object c) {
        Coord c2 = (Coord)c;
        if(this.x == c2.getX() && this.y == c2.getY()){
            return true;
        }
        return false;
    }
}
