package Unit3.Day10;

public class Student {
    private String name = "";
    private Course[] courses;

    public Student(String n, int amountOfCourses){
        courses = new Course[amountOfCourses];

    }
}