package Unit8.Day1;

public class Tester {
    public static void main(String[] args) {
        GeoFig[] figs = new GeoFig[100];

        for (int i = 0; i < figs.length; i++) {
            int shape = (int)(Math.random()*3);
            switch (shape){
                case 0:
                    figs[i] = new Circle((int)(Math.random()*10)+1);
                    break;
                case 1:
                    figs[i] = new Square((int)(Math.random()*20)+2);
                    break;
                case 2:
                    figs[i] = new Rectangle((int)(Math.random()*20)+2, (int)(Math.random()*20)+2);
                    break;
            }
        }
        for(GeoFig g : figs){
            System.out.println(g);
        }
        GeoFig.sortArray(figs);
        for(GeoFig g : figs){
            System.out.println(g);
        }
    }
}
