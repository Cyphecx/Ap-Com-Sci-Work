package Unit8.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Mover> movers = new ArrayList<Mover>();
        Scanner scan = new Scanner(System.in);

        int end = 0;
        while (end == 0) {
            System.out.println("Would you like to enter a Car(1) or a Dog(2) or any other number to exit");
            int choice = scan.nextInt();
            scan.nextLine();
            if(choice == 1){
                System.out.println("Enter the make");
                String m = scan.nextLine();
                System.out.println("Enter year");
                int y = scan.nextInt();
                System.out.println("Enter Top Speed");
                int t = scan.nextInt();
                movers.add(new Car(y,m,t));
            }
            if(choice == 2){
                System.out.println("Enter a name");
                String n = scan.nextLine();
                System.out.println("Enter an age");
                int a = scan.nextInt();
                System.out.println("Enter a top speed");
                int t = scan.nextInt();
                movers.add(new Dog(a,n,t));
            }
            else{
                end = 1;
            }
        }
        Dog smallest = new Dog(0,"",Integer.MAX_VALUE);
        int sIndex = 0;
        for (int i = 0; i < movers.size(); i++) {
            for (int j = i; j < movers.size(); j++) {
                if(movers.get(j).compareTo(smallest) == -1){
                    sIndex = j;
                }
            }
            Mover temp = movers.get(sIndex);
            movers.set(sIndex, movers.get(i));
            movers.set(i, temp);
        }

        for (Mover m : movers) {
            System.out.println(m);
        }
    }
}
