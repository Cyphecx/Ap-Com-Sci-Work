package Unit8.Day1;

public abstract class GeoFig{
       static int numGeoFig;
       GeoFig()
       {
              numGeoFig++;
       }
       
       abstract double getArea(); 
       
       abstract double getPerimeter();
       
       public String toString() {
              return "Area = "+getArea()+", Perimeter = "+getPerimeter();
       }

       public boolean moreArea(GeoFig fig){
           if(this.getArea() < fig.getArea()){
               return false;
           }
           else{
               return true;
           }
       }

       public boolean morePerimeter(GeoFig fig){
          if(this.getPerimeter() < fig.getPerimeter()){
              return false;
          }
          else{
              return true;
          }
       }

       public static void sortArray(GeoFig[] figs){
           for (int i = 0; i < figs.length; i++) {
               GeoFig smallest = new Circle(Integer.MAX_VALUE);
               int indexOfSmallest = -1;
               for (int j = i; j < figs.length; j++) {
                   if(smallest.moreArea(figs[j])){
                       smallest = figs[j];
                       indexOfSmallest = j;
                   }
               }
               GeoFig temp = figs[i];
               figs[i] = figs[indexOfSmallest];
               figs[indexOfSmallest] = temp;
           }

       }
}
