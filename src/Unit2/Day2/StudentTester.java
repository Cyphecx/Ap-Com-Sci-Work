package Unit2.Day2;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students would you like?");
        Student[] students = new Student[scan.nextInt()];

        for(int i = 0; i < students.length; i++){
            String firstName = scan.nextLine();
            System.out.println("Please enter first name, last name, age, and gpa.");

            students[i] = new Student(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextDouble());
            System.out.println(students[i]);
        }
        Student bestG = new Student();
        for(Student s : students){
            if(s.gpa > bestG.gpa){
                bestG = s;
            }
        }
        Student old = new Student();
        for(Student s : students){
            if(s.age > old.age){
                old = s;
            }
        }
        Student[] temp = students;
        for(int k = 0; k < students.length; k++){
            for(int i = students.length-1; i > k; i--){
                if(students[k].firstName.charAt(0) > students[i].firstName.charAt(0)){
                    Student temp2 = students[k];
                    temp[k] = students[i];
                    temp[i] = temp2;
                    break;
                }
            }
        }
        System.out.println("The oldest student is " + old);
        System.out.println("The student with the best gpa is " + bestG);
        for(Student x: temp){
            System.out.println(x);
        }
    }
}
