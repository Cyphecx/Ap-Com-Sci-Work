package Unit2.Day3;

import java.util.Scanner;

public class SquareTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many squares would you like?");
        Square[] squares = new Square[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Please enter xCenter, yCenter, length, and fill status for Square " + (i+1));
            String data = scan.nextLine();
            int spaces = 0;
            for (int k = 0; k < data.length(); k++) {
                if (data.charAt(k) == ' ') {
                    spaces++;
                }
            }
            if (spaces != 3) {
                System.out.println("Your data is formatted incorrectly!");
                i--;
                continue;
            }
            int lastSpace = -1;
            spaces = 0;
            int xPos = 0;
            int yPos = 0;
            int len = 0;
            boolean filled = false;
            for (int k = 0; k < data.length(); k++) {
                if (data.charAt(k) == ' ') {
                    switch (spaces) {
                        case 0:
                            yPos = Integer.parseInt(data.substring(lastSpace + 1, k));
                            break;
                        case 1:
                            xPos = Integer.parseInt(data.substring(lastSpace + 1, k));
                            break;
                        case 2:
                            len = Integer.parseInt(data.substring(lastSpace + 1, k));
                            break;
                    }
                    if (spaces == 2) {
                        filled = Boolean.parseBoolean(data.substring(k+1));
                    }
                    lastSpace = k;
                    spaces++;
                }
            }
            squares[i] = new Square(xPos, yPos, len, filled);
        }
        System.out.println("Enter a coordinate");
        String coord = scan.nextLine();
        int xp = 0;
        int yp = 0;
        for (int i = 0; i < coord.length(); i++) {
            if (coord.charAt(i) == ' ') {
                {
                    xp = Integer.parseInt(coord.substring(0, i));
                    yp = Integer.parseInt(coord.substring(i + 1));
                }
            }
        }
        int matches = 0;
        for (Square s : squares) {
            if (s.contains(xp, yp)) {
                System.out.println(s);
                matches++;
            }
        }
        System.out.println(matches + " Square(s) contain the point " + xp + ", " + yp);
    }
}
