package Unit6.Day7;

import Unit3.Quiz1.Friends;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<MyFriend> friends = new ArrayList<MyFriend>();
        boolean run = true;

        while(run){
            System.out.println(friends);
            System.out.println("1 – Add a friend, either to the end or to a specific index\n" +
                    "2 – Search for a friend by name\n" +
                    "3 – Sort the friends by age\n" +
                    "4 – Delete a friend by name\n" +
                    "5 – Change name of a friend, by name\n" +
                    "6 – Change age of a friend, by name\n" +
                    "7 – Exit\n");

            int choice = scan.nextInt();
            scan.nextLine();
            String in;
            int num;
            switch (choice) {
                case 1:
                    System.out.println("Add to the end(1) or at an index(2)?");
                    num = scan.nextInt();
                    scan.nextLine();
                    if (num == 1){
                        System.out.println("Type a name and an age");
                        String name = scan.nextLine();
                        int n = scan.nextInt();
                        friends.add(new MyFriend(name, n));
                    }
                    else if(num == 2){
                        System.out.println("Type a name and an age");
                        String name = scan.nextLine();
                        int n = scan.nextInt();
                        System.out.println("Enter the index");
                        friends.add(scan.nextInt(), new MyFriend(name, n));
                    }
                    scan.nextLine();
                    break;

                case 2:
                    System.out.println("what is the person's name?");
                    in = scan.nextLine();
                    boolean found = false;
                    for(int i = 0; i < friends.size(); i++){
                        if (friends.get(i).getName().equals(in)){
                            System.out.println(in + " is found at index " + i +"| "+ friends.get(i));
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println(in + " was not found");
                    }
                    break;
                case 3:
                    friends = mergeSort(friends);
                    break;

                case 4:
                    System.out.println("what is the person's name?");
                    in = scan.nextLine();
                    found = false;
                    for(int i = 0; i < friends.size(); i++){
                        if (friends.get(i).getName().equals(in)){
                            friends.remove(i);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println(in + " was not found");
                        break;
                    }
                    break;
                case 5:
                    System.out.println("what is the person's name?");
                    in = scan.nextLine();
                    MyFriend f = new MyFriend("",0);
                    found = false;
                    for(int i = 0; i < friends.size(); i++){
                        if (friends.get(i).getName().equals(in)){
                            f = friends.get(i);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println(in + " was not found");
                        break;
                    }
                    System.out.println("what is the new name?");
                    f.setName(scan.nextLine());
                    break;
                case 6:
                    System.out.println("Who's age do you want to change?");
                    in = scan.nextLine();
                    f = new MyFriend("",0);
                    found = false;
                    for(int i = 0; i < friends.size(); i++){
                        if (friends.get(i).getName().equals(in)){
                            f = friends.get(i);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println(in + " was not found");
                        break;
                    }
                    System.out.println("what is the new age?");
                    f.setAge(scan.nextInt());
                    scan.nextLine();
                    break;
                case 7:
                    System.exit(12903);
                    break;
            }
            System.out.println();
        }

    }
    public static ArrayList mergeSort(ArrayList<MyFriend> friends){
        if(friends.size() <= 1){
            return friends;
        }
        else{
            ArrayList<MyFriend> lowerHalf = new ArrayList<>(friends.subList(0,friends.size()/2));
            ArrayList<MyFriend> upperHalf = new ArrayList<>(friends.subList(friends.size()/2,friends.size()));
            return merge(mergeSort(lowerHalf), mergeSort(upperHalf));
        }
    }

    public static ArrayList merge(ArrayList<MyFriend> lower, ArrayList<MyFriend> upper){
        ArrayList out = new ArrayList();
        while(lower.size() > 0 && upper.size() > 0){
            if(lower.get(0).getName().charAt(0) < upper.get(0).getName().charAt(0)){
                out.add(lower.get(0));
                lower.remove(0);
            }
            else{
                out.add(upper.get(0));
                upper.remove(0);
            }
        }
        while(lower.size() > 0){
            out.add(lower.get(0));
            lower.remove(0);
        }
        while(upper.size() > 0){

            out.add(upper.get(0));
            upper.remove(0);
        }
        return out;
    }
}
