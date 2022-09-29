import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name){
    this.name = name;

    }

   public void addCourse(Course c){
    courses.add(c);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Courses=" + courses +
                '}';
    }
}
