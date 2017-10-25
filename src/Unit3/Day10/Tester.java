package Unit3.Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many courses are there?");
        Course[] courses = new Course[scan.nextInt()];
        scan.nextLine();

        for (int i = 0; i < courses.length; i++) {
            System.out.println("What is the name of course #" + (i+1));
            String name = scan.nextLine();
            System.out.println("Who teaches "+ name +"?");
            courses[i] = new Course(name,scan.nextLine());
        }
        System.out.println("How many students are there?");
        Student[] students = new Student[scan.nextInt()];
        scan.nextLine();

        for (int i = 0; i < students.length; i++) {
            System.out.println("What is the name of student #" + (i+1));
            String name = scan.nextLine();
            students[i] = new Student(name);
        }

        for (Student stu:students) {
            ArrayList<Course> availableCourses = new ArrayList<Course>(Arrays.asList(courses));
            System.out.println("How many courses does " + stu.getName() + " take?");
            int courseCount = scan.nextInt();
            stu.initCourses(courseCount);
            for (int i = 0; i < courseCount; i++) {
                System.out.println("Please select " + stu.getName() + "'s course #" + (i+1));
                for (int j = 0; j < availableCourses.size(); j++) {
                    System.out.println((j+1) + "- " + availableCourses.get(j).getName());
                }
                int selection = scan.nextInt();
                stu.addCourse(availableCourses.get(selection-1));
                availableCourses.remove(selection-1);
            }
        }
        for (Student s: students) {
            System.out.println(s);
        }
    }
}