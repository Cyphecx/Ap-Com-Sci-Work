package Unit4.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<Member>();
        int input = 0;
        do{
            System.out.println("1: add members \n" +
                               "2: remove members \n" +
                               "3: find oldest member \n" +
                               "4: find average age \n" +
                               "5: exit");
            input = scan.nextInt();
            scan.nextLine();
            switch(input){
                case 1:
                    System.out.println("Enter a name");
                    String name = scan.nextLine();
                    System.out.println("Enter an ID");
                    int id = scan.nextInt();
                    System.out.println("Enter an age");
                    int age = scan.nextInt();
                    members.add(new Member(name, id, age));
                    break;

                case 2:
                    System.out.println("Enter the index of the member");
                    int index = scan.nextInt();
                    members.remove(index);
                    break;

                case 3:
                    System.out.println("The oldest member is " + Member.oldestMember(members));
                    break;

                case 4:
                    System.out.println("The average age is "+ Member.averageAge(members) + " years old");
                    break;
            }
            for(Member m:members){
                System.out.println(m);
            }
        }while(input != 5);

        for(Member m:members){
            System.out.println(m);
        }

    }
}

