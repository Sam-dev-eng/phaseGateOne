import java.util.ArrayList;

public class StudentLibrary {
    public static ArrayList<Student> students = new ArrayList<Student>();

    public static ArrayList<Student> getStudents() {
        return students;

    }
    public void addStudents(Student student) {
        this.students.add(student);


    }

}
