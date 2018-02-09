package Unit8.Day2;

public class Exec extends Employee{

    public Exec(String name, int yearh){
        this.yearHired = yearh;
        this.name= name;
        Employee.numEmployees++;
        Employee.numExecs++;
    }
    @Override
    double getBonus() {
        return (Employee.currentYear - yearHired)*2000 + 3*Employee.basicUniversalBonus() + 0.01 * Employee.profit;
    }
}
