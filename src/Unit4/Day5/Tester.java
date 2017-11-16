package Unit4.Day5;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        MathStudent ms1 = new MathStudent();
        ms1.go();
        ms1.summary();
    }
}

