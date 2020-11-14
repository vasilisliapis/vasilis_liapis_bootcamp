
package briefproject;
import java.util.*;
import java.text.*;

public class FormattedPrint{
    public static void printStudents(List<Course>courses,Student student)throws ParseException
    {
       // String str="|  First Name       |    Last Name      |  Date Of Birth    |  Tuition Fees     |";
        String str2="+ - - - - - - - - - + - - - - - - - - - + - - - - - - - - - + - - - - - - - - - +";
        int i=19;
        DateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        //Date date=formatter.parse(day);
        System.out.println(str2);
        System.out.format("|%-"+i+"s|%-"+i+"s|%-"+i+"s|%-"+i+"d|",student.getFirstName(),student.getLastName(),formatter.format(student.getDateOfBirth()),student.getTuitionFees());
        System.out.println();     
    }
    public static void printTrainers(List<Course>courses,Trainer trainer)throws ParseException
    {
        //String str="|  First Name       |    Last Name      |      Subject       |";
        String str2="+ - - - - - - - - - + - - - - - - - - - + - - - - - - - - - + ";
        int i=19;
        //Date date=formatter.parse(day);
        System.out.println(str2);
        System.out.format("|%-"+i+"s|%-"+i+"s|%-"+i+"s|",trainer.getFirstName(),trainer.getLastName(),trainer.getSubject());
        System.out.println();     
    }
     public static void printCourses(Course course)throws ParseException
    {
       // String str="|   Title     |   Stream    |   Title     | Start Date  |  End Date   |";
        String str2="+ - - - - - - + - - - - - - + - - - - - - + - - - - - - + - - - - - - +";
        int i=13;
        DateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        //Date date=formatter.parse(day);
        System.out.println(str2);
        System.out.format("|%-"+i+"s|%-"+i+"s|%-"+i+"s|%-"+i+"s|%-"+i+"s|",course.getTitle(),course.getStream(),course.getType(),formatter.format(course.getStart_date()),formatter.format(course.getEnd_date()));
        System.out.println();     
    }
    public static void printAssignments(List<Course>courses,Assignment assignment)throws ParseException
    {
       // String str="|       Title       |         Description           |   Sub Date Time    |";
       String str2="+ - - - - - - - - - + - - - - - - - - - - - - - - - + - - - - - - - - - - +";
        int i=19;
        DateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        //Date date=formatter.parse(day);
        System.out.println(str2);
        System.out.format("|%-"+i+"s|%-"+31+"s|%-"+21+"s|",assignment.getTitle(),assignment.getDescription(),formatter.format(assignment.getSubDateTime()));
        System.out.println();     
    }
}
