package Unit3.Quiz1;

import java.util.Scanner;

public class Tester {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("How many friends do you want?");
         Friends[] friends = new Friends[scan.nextInt()];
         System.out.println("Please enter their names");
         scan.nextLine();
         for (int i = 0; i < friends.length; i++) {
             friends[i] = new Friends(scan.nextLine());
         }

         for(Friends f : friends){
             System.out.println("How many hobbies does " + f.name + " have?");
             Hobbies[] h = new Hobbies[scan.nextInt()];
             System.out.println("Please enter the name of the hobbies");
             scan.nextLine();
             for (int i = 0; i < h.length; i++) {
                 h[i] = new Hobbies(scan.nextLine());
             }
             f.hobs = h;
         }

         System.out.println("Here is a summary:");
         for(Friends f : friends){
             System.out.println(f);
         }
     }
}

