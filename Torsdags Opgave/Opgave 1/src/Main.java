public class Main {
    public static void main(String[] args) {

        Student s = new Student("Malde");
        Course Basic = new Course("Mat");

        s.addCourse(Basic);
        System.out.println(s);


    }
}
