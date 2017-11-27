package Unit4.Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    static ArrayList<String> names = new ArrayList<String>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name to start");
        names.add(scan.nextLine());
        boolean run = true;
        while(run){
            System.out.println(names);
            System.out.println("\t1. Add name to the end \n" +
                    "\t2. Add name at index \n" +
                    "\t3. Delete name at index\n" +
                    "\t4. Delete name by name\n" +
                    "\t5. Sort alphabetically\n" +
                    "\t6. Sort alphabetically starting at a given index\n" +
                    "\t7. Sort by name length\n" +
                    "\t8. Scramble name order\n" +
                    "\t9. Reverse each name\n" +
                    "\t10. Delete range of names by index\n" +
                    "\t11. Delete range of names by first letter");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter a new name");
                    addName(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Enter an index");
                    int ind = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter a new name");
                    addNameAtIndex(ind, scan.nextLine());
                    break;
                case 3:
                    System.out.println("Enter an index");
                    int in = scan.nextInt();
                    deleteNameAtIndex(in);
                    break;
                case 4:
                    System.out.println("What name do you want to delete?");
                    deleteNameByObject(scan.nextLine());
                    break;
                case 5:
                    sortByAlphabet();
                    break;
                 case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                default:
                    System.out.println("That was an invalid number");
                    break;
            }
        }


    }

    public static void addName(String n){
        names.add(n);
    }

    public static void addNameAtIndex(int ind, String n){
        if(ind < 0 || ind > names.size()-1){
            System.out.println("Invalid index!");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){ }
        }
        else {
            names.add(ind, n);
        }
    }

    public static void deleteNameAtIndex(int index){
        if(index < 0 || index > names.size()-1){
            System.out.println("Invalid index!");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){ }
        }
        else{
            names.remove(index);
        }
    }

    public static void deleteNameByObject(String name){
        names.remove(name);
    }

    public static void sortByAlphabet(){
        ArrayList<String> newl = new ArrayList<String>();
        newl.add(names.get(0));
        names.remove(0);
        for (String s : names){
            for(int i = 0; i < newl.size(); i++){
                if(s.charAt(0) < newl.get(i).charAt(0)){
                    newl.add(i,s);
                    break;
                }
                if(i == newl.size()-1){
                    newl.add(s);
                    break;
                }
                System.out.println(i);
            }
        }
        names = newl;
    }

    public static void sortAlphabetByIndex(int index){
        sortByAlphabet();
        ArrayList<String> newl = new ArrayList<String>();
        for (int i = index; i < names.size(); i++) {
            newl.add(names.get(i));
        }
        for (int i = 0; i <index ; i++) {
            newl.add((names.get(i)));
        }
        names = newl;
    }
}
