package Unit3.Day3;

import java.util.ArrayList;
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
        ArrayList<Triangle> RightTriangles = new ArrayList<Triangle>();
        ArrayList<Triangle> AcuteTriangles = new ArrayList<Triangle>();
        ArrayList<Triangle> ObtuseTriangles = new ArrayList<Triangle>();
        ArrayList<Triangle> InvalidTriangles = new ArrayList<Triangle>();
        for (Triangle t : triangles) {
            switch (t.getType()){
                case "Right":
                    RightTriangles.add(t);
                    break;
                case "Acute":
                    AcuteTriangles.add(t);
                    break;
                case "Obtuse":
                    ObtuseTriangles.add(t);
                    break;
                case "Invalid":
                    InvalidTriangles.add(t);
                    break;
            }
        }
        System.out.println("There are " + Triangle.similar(triangles) + " similiarities");
        System.out.println("There are " + RightTriangles.size() + " Right Triangles.");
        for(Triangle t : RightTriangles){
            System.out.println("\t" + t);
        }
        System.out.println("There are " + AcuteTriangles.size() + " Acute Triangles.");
        for(Triangle t : AcuteTriangles){
            System.out.println("\t" + t);
        }
        System.out.println("There are " + ObtuseTriangles.size() + " Obtuse Triangles.");
        for(Triangle t : ObtuseTriangles){
            System.out.println("\t" + t);
        }
        System.out.println("There are " + InvalidTriangles.size() + " Invalid Triangles.");
        for(Triangle t : InvalidTriangles){
            System.out.println("\t" + t);
        }
    }
}
