package UnitTwo.Day4;

import java.util.Scanner;

public class TvTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many tvs do you want?");
        int size = scan.nextInt();
        Tv[] tvs = new Tv[size];
        scan.nextLine();
        for(int i = 0; i < tvs.length; i++){
            System.out.println("Pleae enter a name for tv " + (i+1));
            tvs[i] = new Tv(scan.nextLine());
        }

        while(true){
            System.out.println("Which tv would you like to adjust?\n");
            for(int i = 0; i < tvs.length; i++){
                System.out.println("Type " + (i+1) + " for " + tvs[i].name);
            }
            Tv pick = tvs[scan.nextInt()-1];
            System.out.println("Type 1 for on/of\n" +
                    "Type 2 to increase volume\n" +
                    "Type 3 to decrease volume\n" +
                    "Type 4 to increase channel\n" +
                    "Type 5 to decrease channel\n" +
                    "Type 6 to set channel\n" +
                    "Type 7 to exit");
            int choice = scan.nextInt();
            if(choice == 7){
                break;
            }
            switch (choice){
                case 1:
                    pick.toggleState();
                    break;
                case 2:
                    pick.volUp();
                    break;
                case 3:
                    pick.volDown();
                    break;
                case 4:
                    pick.chanUp();
                    break;
                case 5:
                    pick.chanDown();
                    break;
                case 6:
                    int channel = -1;
                    do{
                    System.out.println("Enter a channel number");
                    channel = scan.nextInt();
                    }while(channel < 1 && channel >120);
                    pick.chanSet(channel);
                    break;
            }
            System.out.println();
            for(Tv x : tvs){
                System.out.println(x);
            }
            System.out.println();
        }

    }
}
