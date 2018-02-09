package Unit8.Day2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);
        System.out.println("What are this year's profits?");
        Employee.profit = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the current year?");
        Employee.currentYear = scan.nextInt();
        scan.nextLine();

        while(true){
            System.out.println("Enter the Employee's name");
            String name = scan.nextLine();
            System.out.println("What type of Employee?\n" +
                    "1. Exec\n" +
                    "2. Sales\n" +
                    "3. Hourly\n");
            int type = scan.nextInt();
            scan.nextLine();
            switch (type){
                case 1:
                    System.out.println("When were they hired?");
                    employees.add(new Exec(name, scan.nextInt()));
                    break;
                case 2:
                    System.out.println("What is their salary?");
                    int salary = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What was their annual sales");
                    int sales = scan.nextInt();
                    employees.add(new Sales(name, salary,sales));
                    break;
                case 3:
                    System.out.println("What is their hourly rate?");
                    int rate = scan.nextInt();
                    scan.nextLine();
                    System.out.println("When did they start working here?");
                    int year = scan.nextInt();
                    employees.add(new Hourly(name, year, rate));
                    break;
            }
            scan.nextLine();
            for(Employee e : employees){
                System.out.println(e);
            }
        }
    }
}
