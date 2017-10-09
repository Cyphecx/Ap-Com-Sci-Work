package Unit3.Day4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of students.");
        int studentAmount = scan.nextInt();

        System.out.println("Enter quantity of quizzes");
        int quizAmount = scan.nextInt();
        scan.nextLine();

        System.out.println("What are the students names?");
        String names = scan.nextLine();

        Student[] students = new Student[studentAmount];
        int pos = 0;
        int spaces = 0;
        for (int i = 0; i < names.length(); i++) {
            if(names.charAt(i) == ' '){
                spaces++;
                System.out.println(spaces);
                if(studentAmount <= 1){
                    students[spaces] = new Student(names.substring(pos), quizAmount);
                }
                else if(spaces == studentAmount-1){
                    students[spaces-1] = new Student(names.substring(pos, i), quizAmount);
                    students[spaces] = new Student(names.substring(i+1), quizAmount);
                }

                else{
                    pos = i+1;
                    students[spaces-1] = new Student(names.substring(pos, i), quizAmount);
                }
            }
        }
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
