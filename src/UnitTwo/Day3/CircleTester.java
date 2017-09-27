package UnitTwo.Day3;

import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many circles would you like?");
        Circle[] circles = new Circle[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Please enter xCenter, yCenter, radius for Circle " + i);
            String data = scan.nextLine();
            int spaces = 0;
            for (int k = 0; k < data.length(); k++) {
                if (data.charAt(k) == ' ') {
                    spaces++;
                }
            }
            if (spaces != 2) {
                System.out.println("Your data is formatted incorrectly!");
                i--;
                continue;
            }
            int lastSpace = -1;
            spaces = 0;
            int xPos = 0;
            int yPos = 0;
            int radius = 0;
            for (int k = 0; k < data.length(); k++) {
                if (data.charAt(k) == ' ') {
                    switch (spaces) {
                        case 0:
                            yPos = Integer.parseInt(data.substring(lastSpace + 1, k));
                            break;
                        case 1:
                            xPos = Integer.parseInt(data.substring(lastSpace + 1, k));
                            break;

                    }
                    if (spaces == 1) {
                        radius = Integer.parseInt(data.substring(k+1));
                    }
                    lastSpace = k;
                    spaces++;
                }
            }
            circles[i] = new Circle(xPos, yPos, radius);
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
        for (Circle c : circles) {
            if (c.containsPoint(xp, yp)) {
                System.out.println("Circle (" + c.xCenter + "," + c.yCenter + ") Radius: " + c.radius);
                matches++;
            }
        }
        System.out.println(matches + "Circles contain the point " + xp + ", " + yp);
    }
}
