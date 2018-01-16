package Unit6.Day7;

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
                    "6 – Change age of a friend, by name" +
                    "1 – Exit\n");

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
            }
            System.out.println();
        }

    }
}
