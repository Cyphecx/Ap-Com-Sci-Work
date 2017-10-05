package Unit2.Day3;

public class Square {
    int xCenter = 0;
    int yCenter = 0;
    int length = 0;
    boolean filled = false;

    public Square(){}

    public Square(int x, int y, int l, boolean f){
        this.xCenter = x;
        this.yCenter = y;
        this.length = l;
        this.filled = f;
    }

    public int getArea(){
        return length*length;
    }

    public int perimeter(){
        return 4*length;
    }

    public String toString(){
        return "Center: ("+ xCenter + ","+ yCenter +")|Length: " + length + " Filled: " + filled;
    }

    public boolean contains(int x, int y){
        if(this.filled && x <= xCenter + length/2 && x >= xCenter - length/2 && y <= yCenter + length/2 && y >= yCenter - length/2){
            return true;
        }
        else if(!this.filled && (((x == xCenter + length/2 || x == xCenter - length/2) && y < yCenter - length/2 && y < yCenter + length/2) ||
                ((y == yCenter + length/2 || y == yCenter - length/2) && x < xCenter - length/2 && x < xCenter + length/2))){
            return true;
        }
        else{
            return false;
        }
    }
}

