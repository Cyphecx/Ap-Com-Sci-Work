package Unit8.Day3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        boolean run = true;
        while (run) {
            System.out.println("Enter the students name.");
            String name = scan.nextLine();
            int temp = 0;
            ArrayList<Integer> scores = new ArrayList<Integer>();
            System.out.println("Enter " + name + "'s scores");
            while ((temp = scan.nextInt()) != -1) {
                scores.add(temp);
            }
            scan.nextLine();
            students.add(new Student(name, scores));
            System.out.println("Enter 0 to exit or 1 to add another Student");
            int choice = scan.nextInt();
            if (choice == 0) {
                run = false;
            } else if (choice != 1) {
                System.out.println("Thats not 0 or 1; Defaulting to add another student");
            }
            scan.nextLine();
        }
        int lowestScoreIndex = students.size() - 1;
        for (int i = students.size() - 1; i > 0; i--) {
            Student lowestScore = new Student();
            for (int j = i; j >= 0; j--) {
                if (lowestScore.compareTo(students.get(j)) > 0) {
                    lowestScore = students.get(j);
                    lowestScoreIndex = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, lowestScore);
            students.set(lowestScoreIndex, temp);
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
