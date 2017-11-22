package Unit4.Quiz1;

public class Customer
{
    private String customerName;
    private double miles;
    private double gallons;
    private double pricePerGallon;

    Customer()
    {

    }

    Customer(String x, double y, double z, double a)
    {
        customerName = x;
        miles = y;
        gallons = z;
        pricePerGallon = a;
    }

    double getMiles()
    {
        return miles;
    }

    double getGallons()
    {
        return gallons;
    }

    double getPricePerGallon()
    {
        return pricePerGallon;
    }

}

