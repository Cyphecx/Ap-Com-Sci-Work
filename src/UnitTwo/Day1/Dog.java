package UnitTwo.Day1;

public class Dog {
    String name = "";
    String breed = "";
    int age = 0;
    int height = 0;
    int weight = 0;
    static int numDogs = 0;

    public Dog(){
        numDogs++;
    }

    public Dog(String name, String breed){
        numDogs++;
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int age, int height, int weight){
        numDogs++;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public boolean isOld(){
        if(this.age >= 10) {
            return true;
        }
        return false;
    }
}
