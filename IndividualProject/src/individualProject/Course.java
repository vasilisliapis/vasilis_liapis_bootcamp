package individualProject;
import java.util.*;

public class Course{
    String name;
    private List<Student> students;
    private List<Trainer> trainers;
    private List<Assignment> assignments;
    public Course(String name,List<Student> students,List<Trainer> trainers,List<Assignment> assignments)
    {
        this.name=name;
        this.students=students;
        this.trainers=trainers;
        this.assignments=assignments;
    }
    public Course(Course original)
    {
        this(original.name,original.students,original.trainers,original.assignments);
    }
    public List<Student> getStudents()
    {
        return new ArrayList<Student>(this.students);
    }
    public List<Trainer> getTrainers() {
        return new ArrayList<Trainer>(this.trainers);
    }  
    public List<Assignment> getAssignments() {
        return assignments;
    }
}
