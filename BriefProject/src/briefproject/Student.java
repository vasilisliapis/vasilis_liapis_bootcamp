
package briefproject;
import java.util.*;
public class Student {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int tuitionFees;
    private ArrayList<String>courses=new ArrayList<String>();
    
    public Student()
    {
        
    }
    public Student(String firstName,String lastName,Date dateOfBirth,int tuitionFees,ArrayList<String>courses)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        this.tuitionFees=tuitionFees;
        this.courses=courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(String course) {
        this.courses.add(course);
    }
    
}
