
package briefproject;
import java.text.ParseException;
import java.util.*;
import static java.lang.Integer.parseInt;
import java.text.*;

public class Processes{
     static void mainProcess()throws ParseException
    {
        Scanner sc=new Scanner(System.in);
        String str;
        List<Course> courses=new ArrayList<Course>();
        int i;
        System.out.println("if you want to manually fill the database press 1 else press 2 to use the default one.");
        str=sc.next();
        i=checkInput(str);
        if(i==1)
        {
            courses=Manual_Initialization.initialization();
        }
        else
        {
            courses=Automatic_Initialization.initialization();
        }
        while(true)
        {
            
            Automatic_Initialization.printMenu();
            i=sc.nextInt();
            if(i==1)
            {
                Processes.printAllStudents(courses);
            }
            else if(i==2)
            {
                Processes.printAllTrainers(courses);
            }
            else if(i==3)
            {
                Processes.printAllAssignments(courses);
            }
            else if(i==4)
            {
                Processes.printAllCourses(courses);
            }
            else if(i==5)
            {
                System.out.println("Give the Course that you wanna see all it's Students for example: ");
                for(Course c:courses)
                {
                    System.out.println(c.getTitle()+", ");
                }
                str=sc.next();
                Processes.printAllStudentsOfACourse(courses,str);
            }
            else if(i==6)
            {
                System.out.println("Give the Course that you wanna see all it's Trainers for example: ");
                str=sc.next();
                Processes.printAllTrainersOfACourse(courses,str);
            }
            else if(i==7)
            {
                System.out.println("Give the Course that you wanna see all it's Assignments for example: ");
                str=sc.next();
                Processes.printAllAssignmentsOfACourse(courses,str);
            }
            else if(i==8)
            {
                Processes.printAllAssignmentsPerStudent(courses);
            }
            else if(i==9)
            {
                Processes.printStudentsWhoBelongInManyCourses(courses);
            }
            else if(i==0)
            {
                break;
            }
            else
            {
                System.out.println("You press wrong number you should press one of the options 1-4");
            }
            System.out.println("To continue press any number else press 0");
            i=sc.nextInt();
            if(i==0)
            {
                break;
            }
            
        }   
    }
     
     static void printAllAssignmentsOfACourse(List<Course> courses,String str)
    {
        for(Course c:courses)
        {
            if(c.getTitle().equals(str))
            {
                for(Assignment a:c.getAssignments())
                {
                    System.out.println(a.getTitle()+" "+a.getDescription()+" "+a.getSubDateTime());
                }

            }
        }
    }
    static void printAllAssignmentsPerStudent(List<Course> courses)
    {
        List<Student> students=new ArrayList<Student>();
        List<Student>students2=new ArrayList<Student>();
        List<Assignment>assignments=new ArrayList<Assignment>();
        for(Course c:courses)
        {
            students=c.getStudents();
            for(Student s:students)
            {
                if(!students2.contains(s))
                {
                    assignments=c.getAssignments();
                    for(Assignment a:assignments)
                    {
                        System.out.println(a.getTitle()+" "+s.getFirstName());
                    }
                    students2.add(s);
                }  
            }
        }
    }
    static void printAllStudentsOfACourse(List<Course> courses,String str)
    {
        
        for(Course c:courses)
        {
            if(c.getTitle().equals(str))
            {
                for(int i=0;i<c.getStudents().size();i++)
                {
                    System.out.println(c.getStudents().get(i).getFirstName()+" "+c.getStudents().get(i).getLastName()+" ");
                }
                
            }
        }
    }
     static void printAllCourses(List<Course>courses)throws ParseException
    {
        String str1="|   Title     |   Stream    |   Title     | Start Date  |  End Date   |";
        System.out.println(str1);
        for(Course c:courses)
        {
            FormattedPrint.printCourses(c);
            //System.out.println(c.getTitle()+" "+c.getStream()+" "+c.getType());
        }
    }
    static void printAllStudents(List<Course>courses)throws ParseException
    {
        //DateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        List<Student>students=new ArrayList<Student>();
        List<Student>students2=new ArrayList<Student>();
        String str1="|  First Name       |    Last Name      |  Date Of Birth    |  Tuition Fees     |";
        System.out.println(str1);
        for(Course c:courses)
        {
            students=c.getStudents();
            for(Student s:students)
            {           
                if(!students2.contains(s))
                {
                    
                    FormattedPrint.printStudents(courses, s);
                    //System.out.println(s.getFirstName()+" "+s.getLastName()+" "+formatter.format(s.getDateOfBirth())+" "+s.getTuitionFees());
                    students2.add(s);
                }                    
            }
        }
    }
    static void printAllTrainers(List<Course>courses)throws ParseException
    {
        List<Trainer>trainers=new ArrayList<Trainer>();
        String str1="|  First Name       |    Last Name      |      Subject       |";
        System.out.println(str1);
        for(Course c:courses)
        {
            trainers=c.getTrainers();
            for(Trainer t:trainers)
            {
                FormattedPrint.printTrainers(courses, t);
                //System.out.println(t.getFirstName()+" "+t.getLastName()+" "+t.getSubject());
            }
        }
    }
    static void printAllAssignments(List<Course>courses)throws ParseException
    {
        String str1="|       Title       |         Description           |   Sub Date Time    |";
        System.out.println(str1);
        List<Assignment>assignments=new ArrayList<Assignment>();
        for(Course c:courses)
        {
            assignments=c.getAssignments();
            for(Assignment a:assignments)
            {
                FormattedPrint.printAssignments(courses, a);
                //System.out.println(a.getTitle()+" "+a.getDescription()+" "+a.getSubDateTime());
            }
        }    
    }
    static void printAllTrainersOfACourse(List<Course> courses,String str)
    {
        
        for(Course c:courses)
        {
            if(c.getTitle().equals(str))
            {
                for(int i=0;i<c.getTrainers().size();i++)
                {
                    System.out.println(c.getTrainers().get(i).getFirstName()+" "+c.getTrainers().get(i).getLastName()+" ");
                }
                
            }
        }
    }
    static void printStudentsWhoBelongInManyCourses(List<Course> courses)
    {
        List<Student>students=new ArrayList<Student>();
        List<Student>students2=new ArrayList<Student>();
        for(Course c:courses)
        {
            students=c.getStudents();
            for(Student s:students)
            {
                if(s.getCourses().size()>1&&!(!students2.contains(s)))
                {
                    System.out.println(s.getFirstName()+" "+s.getLastName()+" "+s.getCourses());
                }
                students2.add(s);
            }
        }
    }
    static int checkInput(String str)
    {
        Scanner sc=new Scanner(System.in);
        if(!str.equals("1")&&!str.equals("2"))
        {
            System.out.println("you gave wrong input ");
            System.out.println("if you want to manually fill the database press 1 else press 2 to use the default one.");
            str=sc.next();
            return checkInput(str);   
        }
        else
        {
            return parseInt(str);
        }
    }
    
}
