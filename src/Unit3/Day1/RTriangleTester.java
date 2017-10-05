package Unit3.Day1;

import java.util.Scanner;

public class RTriangleTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter leg1");
        int l1 = scan.nextInt();
        System.out.println("Enter leg2");
        int l2 = scan.nextInt();
        RightTriangle t = new RightTriangle(l1,l2);
        System.out.println("Leg One - "  + t.getLeg1());
        System.out.println("Leg Two - "  + t.getLeg2());
        System.out.println("Hypotenuse - "  + t.getHypotenuse());
        System.out.println("Area - "  + t.getArea());
    }
}
