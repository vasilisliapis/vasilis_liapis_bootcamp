package individualProject;
import java.util.*;

public class Processes {
    static void mainProcess()
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int i;
        List<Course> courses=new ArrayList<Course>();
        courses=Init.initialization();
        while(true)
        {
            
            Init.printMenu();
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
                Processes.printAllCourses(courses);
            }
            else if(i==4)
            {
                System.out.println("Give the Course that you wanna see all it's Students for example( JAVA ,PYTHON etc..)");
                str=sc.next();
                Processes.printAllStudentsOfACourse(courses,str);
            }
            else if(i==5)
            {
                System.out.println("Give the Course that you wanna see all it's Trainers for example( JAVA ,PYTHON etc..)");
                str=sc.next();
                Processes.printAllTrainersOfACourse(courses,str);
            }
            else if(i==6)
            {
                Processes.printStudentsWhoBelongInManyCourses(courses);
            }
            else if(i==7)
            {
                Processes.printAllAssignmentsPerStudent(courses);
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
    static ArrayList<Integer> StudentsIdList(List<Course> courses)
    {
        ArrayList<Integer> idList=new ArrayList<Integer>();
        List<Student> students=new ArrayList<Student>();
        for(Course c:courses)
        {
            students=c.getStudents();
            for(Student s:students)
            {
                if(!idList.contains(s.id))
                {
                    idList.add(s.id);
                }
            }
        }
        return idList;
    }
    static void printAllAssignmentsOfACourse(List<Course> courses,String str)
    {
        for(Course c:courses)
        {
            if(c.name.equals(str))
            {
                for(Assignment a:c.getAssignments())
                {
                    System.out.println(a.name);
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
                    assignments=s.getAssignments();
                    for(Assignment a:assignments)
                    {
                        System.out.println(a.name+" "+s.name);
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
            if(c.name.equals(str))
            {
                for(Student s:c.getStudents())
                {
                    System.out.println(s.name);
                }

            }
        }
    }
    static void printAllTrainersOfACourse(List<Course> courses,String str)
    {
        for(Course c:courses)
        {
            if(c.name.equals(str))
            {
                for(Trainer t:c.getTrainers())
                {
                    System.out.println(t.name);
                }

            }
        }
    }
    static void printAllCourses(List<Course>courses)
    {
        for(Course c:courses)
        {
            System.out.println(c.name);
        }
    }
    static void printAllStudents(List<Course>courses)
    {
        List<Student>students=new ArrayList<Student>();
        List<Student>students2=new ArrayList<Student>();
        for(Course c:courses)
        {
            students=c.getStudents();
            for(Student s:students)
            {           
                if(!students2.contains(s))
                {
                    System.out.println(s.name+" "+s.id+" "+s.course);
                    students2.add(s);
                }                    
            }
        }
    }
    static void printAllTrainers(List<Course>courses)
    {
        List<Trainer>trainers=new ArrayList<Trainer>();
        for(Course c:courses)
        {
            trainers=c.getTrainers();
            for(Trainer t:trainers)
            {
                System.out.println(t.name+" "+t.course);
            }
        }
    }
    static void printStudentsWhoBelongInManyCourses(List<Course>courses)
    {
        List<Student> std=new ArrayList<Student>();
        List<Student>students2=new ArrayList<Student>();
        for(Course c:courses)
        {
            std=c.getStudents();
            for(Student s:std)
            {
                if(s.course.size()>1&&!(students2.contains(s)))
                {
                    System.out.println(s.name);
                    students2.add(s);
                }
                
            }
        }
    }       
}
