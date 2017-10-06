package Unit3.Day3;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    private String type = "";
    public Triangle(int s1, int s2, int s3){
        int[] ordered = new int[]{s1, s2, s3};
        for (int i = 0; i < ordered.length-1; i++) {
            if(ordered[i] > ordered[ordered.length-1]){
                int swp = ordered[i];
                ordered[i] = ordered[ordered.length-1];
                ordered[ordered.length-1] = swp;
            }
        }
        this.side1 = ordered[0];
        this.side2 = ordered[1];
        this.side3 = ordered[2];
        if(side1+side2 < side3){
            this.type = "Invalid";
        }
        else if(Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2)){
            this.type = "Right";
        }
        else if(Math.pow(side1,2) + Math.pow(side2,2) > Math.pow(side3,2)){
            this.type = "Acute";
        }
        else if(Math.pow(side1,2) + Math.pow(side2,2) < Math.pow(side3,2)){
            this.type = "Obtuse";
        }
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String getType() {
        return type;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public static int similar(Triangle[] ts){
        int similar = 0;
        for (int i = 0; i < ts.length; i++) {
            for (int k = (i+1); k < ts.length ; k++) {
                if(ts[i].similar(ts[k])){
                    similar++;
                }
            }
        }
        return similar;
    }
    public boolean similar(Triangle compareTriangle){
        if(compareTriangle.type.equals("Invalid") || this.type.equals("Invalid")){
            return false;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side1, compareTriangle.side2, compareTriangle.side3)){
            return true;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side1, compareTriangle.side3, compareTriangle.side2)){
            return true;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side2, compareTriangle.side1, compareTriangle.side3)){
            return true;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side2, compareTriangle.side3, compareTriangle.side1)){
            return true;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side3, compareTriangle.side1, compareTriangle.side2)){
            return true;
        }
        if(similar(this.side1, this.side2, this.side3, compareTriangle.side3, compareTriangle.side2, compareTriangle.side1)){
            return true;
        }
        return false;
    }
    private boolean similar(int triangOne1, int triangOne2, int triangOne3, int triangTwo1, int triangTwo2, int triangTwo3){
        if((double)(triangOne1)/(double)(triangTwo1) == (double)(triangOne2)/(double)(triangTwo2) && (double)(triangOne2)/(double)(triangTwo2) == (double)(triangOne3)/(double)(triangTwo3)){

            return true;
        }
        return false;
    }

    public String toString() {
        return this.side1 + ", " + this.side2 + ", " + this.side3 + " - " + this.type;
    }
}
