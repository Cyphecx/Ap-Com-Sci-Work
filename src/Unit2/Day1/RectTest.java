package Unit2.Day1;

public class RectTest {
    public static void main(String[] args){
        Rectangle[] rects = new Rectangle[]{new Rectangle(), new Rectangle(3,12), new Rectangle(5), new Rectangle(4,43,"black")};
        for(Rectangle r : rects){
            System.out.println(r);
        }
    }
}
