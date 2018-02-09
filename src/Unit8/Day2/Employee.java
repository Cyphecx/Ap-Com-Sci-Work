package Unit8.Day2;

public abstract class Employee {
    String name;
    static double profit;
    static int currentYear;
    int yearHired;
    double hourlyRate;
    double annualSales;
    double annualSalary;
    static int numEmployees= 0;
    static int numExecs= 0;
    static int numSales= 0;
    static int numHourly= 0;

    abstract double getBonus();
    static double basicUniversalBonus(){
        return 100000/numEmployees;
    }

    public String toString(){
        return name+"| Bonus: "+getBonus();
    };
}
