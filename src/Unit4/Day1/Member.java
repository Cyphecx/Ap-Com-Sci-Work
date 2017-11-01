package Unit4.Day1;

import java.util.ArrayList;

public class Member {
    private String name;
    private int idNum;
    private int age;

    public Member(String n, int i, int a){
        this.name = n;
        this.idNum = i;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIdNum() {
        return idNum;
    }

    public String toString(){
        return this.name + ", ID:#" + this.getIdNum() + this.age + " years old";
    }

    public static Member oldestMember(ArrayList<Member> members){
        Member oldest = new Member("oldest default", -1, 0);

        for(Member m : members){
            if(oldest.age < m.age){
                oldest = m;
            }
        }
        return oldest;
    }

    public static double averageAge(ArrayList<Member> members){
        double totalAge = 0;

        for(Member m: members){
            totalAge += m.age;
        }

        return totalAge/members.size();
    }



}
