package Unit8.Day2;

public class Sales extends Employee{

    public Sales(String name, double annualsalary, double annualsales){
        this.annualSalary = annualsalary;
        this.annualSales = annualsales;
        this.name= name;
        Employee.numEmployees++;
        Employee.numSales++;
    }
    @Override
    double getBonus() {
        return 0.03*annualSalary+ 0.0005*annualSales+ 2*Employee.basicUniversalBonus();
    }
}
