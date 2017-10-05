package Unit3.Day2;

import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many triangles would you like?");
        Triangle[] triangles = new Triangle[scan.nextInt()];
        for(int i = 0; i < triangles.length; i++){
            System.out.println("Enter sides for Triangle " + (i+1));
            int side1 = scan.nextInt();
            int side2 = scan.nextInt();
            int side3 = scan.nextInt();
            triangles[i] = new Triangle(side1,side2,side3);
        }
        System.out.println("There are " + Triangle.similar(triangles) + " similiarities");
    }
}
