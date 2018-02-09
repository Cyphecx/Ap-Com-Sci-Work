package Unit8.Day2;

public class Hourly extends Employee{

    public Hourly(String name, int yearStarted, double hourlyR){
        this.yearHired = yearStarted;
        this.hourlyRate = hourlyR;
        this.name= name;
        Employee.numEmployees++;
        Employee.numHourly++;
    }
    @Override
    double getBonus() {
        return Employee.basicUniversalBonus() + (Employee.currentYear - yearHired)*hourlyRate*5;
    }
}
