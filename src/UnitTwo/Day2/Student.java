package UnitTwo.Day2;

public class Student {
    String firstName = "";
    String lastName = "";
    int age = 0;
    double gpa = 0;

    public Student(){

    }

    public Student(String firstName, String lastName, int age, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + ", age: " + this.age + ", gpa: " + this.gpa;
    }
}
