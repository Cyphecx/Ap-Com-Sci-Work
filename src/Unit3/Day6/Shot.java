package Unit3.Day6;

public class Shot{
    private int type;
    private boolean successful;

    public Shot(int type, boolean s){
        this.type = type;
        this.successful = s;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public int getType() {
        return type;
    }
}
