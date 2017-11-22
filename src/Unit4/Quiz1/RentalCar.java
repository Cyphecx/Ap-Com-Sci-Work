package Unit4.Quiz1;
import java.util.ArrayList;

public class RentalCar {

    private String manufacturer;
    private int yearMade;
    private ArrayList<Customer> customers = new ArrayList<>();

    RentalCar(String x, int y)
    {
        manufacturer = x;
        yearMade = y;
    }


    Customer mostMiles()
    {
        //returns the Customer with the most miles
        Customer mm = new Customer("temp", 0,0,0);
        for(Customer c:customers){
            if(c.getMiles()>mm.getMiles()){
                mm = c;
            }
        }
        return mm;
    }

    void sortGallons()
    {
        //sorts the ArrayList customers by gallons used, ascending.
        ArrayList<Customer> temp = new ArrayList<Customer>();
        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                if(customers.get(i).getGallons() < temp.get(j).getGallons()){
                    temp.add(j, customers.get(i));
                    break;
                }
                if(j == temp.size()-1){
                    temp.add(customers.get(i));
                    break;
                }
            }
        }
        customers = temp;
    }

    static double getMPG(ArrayList<RentalCar> x)
    {
        //   returns the miles per gallon (one value,
//   (total miles)/(total gallons)) for all RentalCars in //  the ArrayList x.
        double miles = 0;
        double gallons = 0;
        for (RentalCar car:x){
            for(Customer c:car.customers){
                miles+=c.getMiles();
                gallons+=c.getGallons();
            }
        }
        return miles/gallons;
    }
}

