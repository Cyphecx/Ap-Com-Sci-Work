package Unit2.Quiz;

import java.util.Scanner;

public class personTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people would you like?");
        int quantity = scan.nextInt();

        quizPeople[] people = new quizPeople[quantity];
        System.out.println("Please enter the information for each person");
        for(int i = 0; i < people.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            int salary = scan.nextInt();
            people[i] = new quizPeople(name,salary);
        }
        quizPeople longestName = new quizPeople("", 0);
        for(int i = 0; i < people.length; i++){
            if(people[i].name.length() > longestName.name.length()){
                longestName = people[i];
            }
            for(int k = people.length-1; k > i; k--){
               if(people[i].salary < people[k].salary){
                    quizPeople temp = people[i];
                    people[i] = people[k];
                    people[k] = temp;
               }
            }
        }

        for(quizPeople p : people){
            System.out.println(p);
        }
        System.out.println("\nThe person with the longest name is " + longestName.name);
    }
}
