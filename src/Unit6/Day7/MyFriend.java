package Unit6.Day7;

public class MyFriend {

    private int age = 0;
    private String name = "";

    public MyFriend(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + ": " + this.age;
    }

}
