
package briefproject;
import java.util.*;
public class Course {
    private String title;
    private String stream;
    private String type;
    private Date start_date;
    private Date end_date;
    private List<Student> students=new ArrayList<Student>();
    private List<Trainer> trainers=new ArrayList<Trainer>();
    private List<Assignment> assignments=new ArrayList<Assignment>();
    public Course()
    {
        
    }
    public Course(String title,String stream,String type,Date start_date,Date end_date,List<Student> students,List<Trainer> trainers,List<Assignment> assignments)
    {
        this.title=title;
        this.stream=stream;
        this.type=type;
        this.start_date=start_date;
        this.end_date=end_date;
        this.students=students;
        this.trainers=trainers;
        this.assignments=assignments;
    }
    public Course(String title,String stream,String type,Date start_date,Date end_date)
    {
        this.title=title;
        this.stream=stream;
        this.type=type;
        this.start_date=start_date;
        this.end_date=end_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(Trainer trainer) {
        this.trainers.add(trainer);
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Assignment assignment) {
        this.assignments.add(assignment);
    }
    
}
