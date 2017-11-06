package Unit4.Day2;

import java.util.ArrayList;

public class Family {
    private ArrayList<Member> members = new ArrayList<Member>();

    public Family(){ }


    public void removeMember(int index){
        members.remove(index);
    }

    public void addMember(String name,  int iq, int age){
        members.add(new Member(name, iq, age));
    }

    public void changeIq(int index, int newIq){
        members.get(index).setIq(newIq);
    }

    public void changeAge(int index, int newAge){
        members.get(index).setAge(newAge);
    }

    public void sortByIq(){
        ArrayList<Member> sorted = new ArrayList<Member>();
        for (Member m : members) {
            boolean spotFound = false;
            for (int i = 0; i < sorted.size(); i++) {
                if(m.getIq() < sorted.get(i).getIq()){
                    sorted.add(i, m);
                    spotFound = true;
                    break;
                }
            }
            if(!spotFound) {
                sorted.add(m);
            }
        }
        this.members = sorted;
    }

    public void sortByAge(){
        ArrayList<Member> sorted = new ArrayList<Member>();
        for (Member m : members) {
            boolean spotFound = false;
            for (int i = 0; i < sorted.size(); i++) {
                if(m.getAge() < sorted.get(i).getAge()){
                    sorted.add(i, m);
                    spotFound = true;
                    break;
                }
            }
            if(!spotFound) {
                sorted.add(m);
            }
        }
        this.members = sorted;
    }
    public String toString(){
        String out = "";
        for (Member m : members) {
            out += (m +"\n");
        }
        return out;
    }
}
