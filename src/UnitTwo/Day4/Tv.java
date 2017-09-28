package UnitTwo.Day4;

public class Tv {
    String name = "";
    boolean on = false;
    int volume = 0;
    int channel  = 1;
    public Tv(){}

    public Tv(String name){
        this.name = name;
    }

    public void toggleState(){
        if(on){
            on = false;
        }
        else{
            on = true;
        }
    }

    public void volUp() {
        if (volume < 19 && on) {
            volume++;
        }
    }
    public void volDown(){
        if(volume > 0 && on) {
            volume--;
        }
    }

    public void chanUp() {
        if (channel == 120 && on) {
            channel = 1;
        } else {
            channel++;

        }
    }
    public void chanDown(){
        if (channel == 1 && on){
            channel = 120;
        }
        else {
            channel--;

        }
    }
    public void chanSet(int chan){
        if(chan >= 1 && chan <= 120 && on){
            channel =chan;

        }
    }
    public String toString(){
        return  name + " tatus= On: " + on + " Channel: " + channel + " Volume: " + volume;
    }
}
