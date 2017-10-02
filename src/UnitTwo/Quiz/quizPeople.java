package UnitTwo.Quiz;

public class quizPeople {
    String name;
    int salary;

    public quizPeople(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "This person is |" + this.name + "|. They make |$" + this.salary +"| dollars a year";
    }
}
