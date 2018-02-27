package Unit8.Day5;

public abstract class Mover implements Comparable{

    private int topSpeed;

    Mover(int top){
        topSpeed = top;
    }
    @Override
    public int compareTo(Object o) {
        Mover m = (Mover)o;
        if(this.topSpeed < m.topSpeed){
            return -1;
        }
        else if(this.topSpeed > m.topSpeed){
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "Top Speed= " +this.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
