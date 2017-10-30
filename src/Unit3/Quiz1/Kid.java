package Unit3.Quiz1;

public class Kid {
    private String name;
    private int age;
    private static int numKids;

    public Kid(){
        numKids++;
    }

    public Kid(String n, int a){
        this.name = n;
        this.age = a;
        numKids++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumKids() {
        return numKids;
    }

    public static void setNumKids(int numKids) {
        Kid.numKids = numKids;
    }
    public String toString(){
        return this.name + " is " + this.age + " years old.";
    }

    public static Kid oldestKid(Kid[] kids){
        Kid oldest = new Kid("Oldest", 0);
        for(Kid k : kids){
            if(oldest.getAge() < k.getAge()){
                oldest = k;
            }
        }
        return oldest;
    }
}
