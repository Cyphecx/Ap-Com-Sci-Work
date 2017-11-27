package Unit4.Quiz1;
import java.util.ArrayList;
import java.util.Scanner;

public class RTester
{
    public static void main (String [] args)
    {
        RentalCar r1 = new RentalCar("vw", 2002);
        RentalCar r2 = new RentalCar ("mercedes",2010);
        r1.getCustomers().add(new Customer("Jones", 500, 20, 2.79));
        r1.getCustomers().add(new Customer("Smith", 200, 40, 2.79));
        r1.getCustomers().add(new Customer("Wooster", 100, 30, 2.79));
        System.out.println(r1.mostMiles());
        System.out.println(r1.getCustomers());
        r1.sortGallons();
        System.out.println(r1.getCustomers());
        r2.getCustomers().add(new Customer("Anderson", 300, 20, 2.79));
        r2.getCustomers().add(new Customer("Manning", 1200, 40, 2.79));
        r2.getCustomers().add(new Customer("Beck", 2100, 300, 2.79));
        ArrayList<RentalCar> x = new ArrayList<>();
        x.add(r1);
        x.add(r2);
        double mpg = RentalCar.getMPG(x);
        System.out.println(mpg+" miles per gallon");


    }
}
