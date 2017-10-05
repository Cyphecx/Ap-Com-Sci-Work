package Unit3.Day1;

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
        int similiar = 0;
        for (int i = 0; i < triangles.length; i++) {
            for (int k = (i+1); k < triangles.length ; k++) {
                if(triangles[i].similar(triangles[k])){
                    similiar++;
                    System.out.println(triangles[i] + " | " + triangles[k]);
                }
            }
        }
        System.out.println("There are " + similiar + " similiarities");
    }
}
