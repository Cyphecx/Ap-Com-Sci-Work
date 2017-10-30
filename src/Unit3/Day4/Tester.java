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
            }
        }
        if(spaces != studentAmount-1){
            System.out.println("There are an incorrect amount of names");
            System.exit(3);
        }
        spaces = 0;
        for (int i = 0; i < names.length(); i++) {
            if(i == names.length()-1){
                students[spaces] = new Student(names.substring(pos), quizAmount);
            }
            else if (names.charAt(i) == ' ') {
                spaces++;
                students[spaces-1] = new Student(names.substring(pos,i), quizAmount);
                pos = i+1;
            }
        }
        for (int i = 0; i < quizAmount; i++) {
            System.out.println("What is the topic of Quiz1 #" + (i+1));
            String topic = scan.nextLine();
            System.out.println("How many total points were on the Quiz1?");
            int totalS = scan.nextInt();

            for (Student s:students) {
                System.out.println("What was " + s.getName() + "'s grade on the " + topic + " Quiz1");
                s.addQuiz(topic, scan.nextInt(), totalS);
            }
            scan.nextLine();
            System.out.println();
        }
        System.out.println("The averages for each student are: ");
        for (Student s : students) {
            System.out.println(s.getName() + " | " + s.quizAverage());
        }
    }
}
