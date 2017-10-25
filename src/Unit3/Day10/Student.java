package Unit3.Day10;

public class Student {
    private String name = "";
    private Course[] courses;
    private int currentCourseIndex = 0;
    public Student(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void initCourses(int size){
        this.courses = new Course[size];
    }

    public void addCourse(Course c){
        courses[currentCourseIndex] = c;
        currentCourseIndex++;
    }

    public String toString(){
        String out = this.name;
        for(Course c:courses){
            out +=", "+c.getName();
        }
        return out;
    }
}