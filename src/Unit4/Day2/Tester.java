package Unit4.Day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Family fam = new Family();
        int input = 0;
        do{
            System.out.println("1: add members \n" +
                               "2: remove members \n" +
                               "3: change age \n" +
                               "4: change IQ \n" +
                               "5: sort by age \n" +
                               "6: sort by IQ \n" +
                               "7: exit");
            input = scan.nextInt();
            scan.nextLine();
            switch(input){
                case 1:
                    System.out.println("Enter a name");
                    String name = scan.nextLine();
                    System.out.println("Enter an IQ");
                    int iq = scan.nextInt();
                    System.out.println("Enter an age");
                    int age = scan.nextInt();
                    fam.addMember(name, iq, age);
                    break;

                case 2:
                    System.out.println("Enter the index of the member");
                    int index = scan.nextInt();
                    fam.removeMember(index);
                    break;

                case 3:
                    System.out.println("Enter index of the member");
                    int inx = scan.nextInt();
                    System.out.println("Enter the new age");
                    int newAge = scan.nextInt();
                    fam.changeAge(inx, newAge);
                    break;

                case 4:
                    System.out.println("Enter index of the member");
                    int i = scan.nextInt();
                    System.out.println("Enter the new iq");
                    int newIq = scan.nextInt();
                    fam.changeIq(i, newIq);
                    break;
            }
            System.out.println(fam);
        }while(input != 7);

        System.out.println(fam);
    }
}

