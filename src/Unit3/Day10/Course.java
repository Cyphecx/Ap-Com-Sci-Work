package Unit3.Day10;

public class Course {
    private String name = "";
    private String teachersName = "";

    public Course(String n, String tname){
        this.name = n;
        this.teachersName = tname;
    }

    public String getName() {
        return name;
    }

    public String getTeachersName() {
        return teachersName;
    }

}
