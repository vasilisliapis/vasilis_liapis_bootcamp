package individualProject;
import java.util.*;

public class Student {
    String name;
    int id;
    ArrayList<String> course;
    private List<Assignment> assignments;
    Student(String name,int id,ArrayList<String> course,List<Assignment> assignments)
    {
        this.name=name;
        this.id=id;
        this.course=course;
        this.assignments=assignments;
    }
    public List<Assignment> getAssignments() {
        return assignments;
    }
    
}
