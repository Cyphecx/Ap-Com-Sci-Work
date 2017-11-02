package Unit4.Day2;

public class Member {
    private String name;
    private int iq;
    private int age;

    public Member(String n, int i, int a){
        this.name = n;
        this.iq = i;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String toString(){
        return this.name + ", IQ: " + this.getIq() + ", " + this.age + " years old";
    }


}
