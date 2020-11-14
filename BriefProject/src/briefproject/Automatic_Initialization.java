package briefproject;
import java.util.*;
import java.text.*;

public class Automatic_Initialization{
    
    static List<Course> initialization()throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date1=sdf.parse("01/09/2020");
        Date date2=sdf.parse("01/10/2020");
        Date date3=sdf.parse("20/12/2020");
        Date date4=sdf.parse("10/12/1998");
        Date date5=sdf.parse("05/04/1995");
        Date date6=sdf.parse("07/06/2000");
        Date date7=sdf.parse("21/09/1999");
        Date date8=sdf.parse("31/05/1999");
        Date date9=sdf.parse("17/02/1987");
        Date date10=sdf.parse("16/07/200");
        Date date11=sdf.parse("24/12/1997");
        Date date12=sdf.parse("15/06/1996");
        Date date13=sdf.parse("12/08/1997");
        Date date14=sdf.parse("02/08/1997");
        //assignments initialization
        Assignment ass1=new Assignment("java_excercise","find the max of an array",date1);
        Assignment ass2=new Assignment("python_excercise","find the min of an array",date1);
        Assignment ass3=new Assignment("csharp_excercise","find the sum of two numbers",date1);
        Assignment ass4=new Assignment("jscript_excercise","create tic tac toe",date1);
        Assignment ass5=new Assignment("java_excercise","multiply matrices",date2);
        Assignment ass6=new Assignment("python_excercise","multiply matrices",date2);
        List<Assignment>java_assignments=new ArrayList<Assignment>();
        List<Assignment>python_assignments=new ArrayList<Assignment>();
        List<Assignment>csharp_assignments=new ArrayList<Assignment>();
        List<Assignment>jscript_assignments=new ArrayList<Assignment>();
        java_assignments.add(ass1);
        java_assignments.add(ass5);
        python_assignments.add(ass2);
        python_assignments.add(ass6);
        csharp_assignments.add(ass3);
        jscript_assignments.add(ass4);
        //trainers initialization
        Trainer trainer1=new Trainer("Vladimiros","Fotiadis","java");
        Trainer trainer2=new Trainer("Maria","Kalogianni","java");
        Trainer trainer3=new Trainer("Eleni","Papapetrou","python");
        Trainer trainer4=new Trainer("Kwstas","Katsimitros","csharp");
        Trainer trainer5=new Trainer("Anastasios","Voulgaris","jscript");
        List<Trainer>java_trainers=new ArrayList<Trainer>();
        List<Trainer>python_trainers=new ArrayList<Trainer>();
        List<Trainer>csharp_trainers=new ArrayList<Trainer>();
        List<Trainer>jscript_trainers=new ArrayList<Trainer>();
        java_trainers.add(trainer1);
        java_trainers.add(trainer2);
        python_trainers.add(trainer3);
        csharp_trainers.add(trainer4);
        jscript_trainers.add(trainer5);
        //students initialization
        String s1="JAVA";
        String s2="PYTHON";
        String s3="C#";
        String s4="JSCRIPT";
        ArrayList<String> a1=new ArrayList<String>();
        ArrayList<String> a2=new ArrayList<String>();
        ArrayList<String> a3=new ArrayList<String>();
        ArrayList<String> a4=new ArrayList<String>();
        ArrayList<String> a5=new ArrayList<String>();
        ArrayList<String> a6=new ArrayList<String>();
        a1.add(s1);
        a2.add(s2);
        a3.add(s3);
        a4.add(s4);
        a5.add(s1);
        a5.add(s2);
        a6.add(s3);
        a6.add(s4);
        Student stud1=new Student("GIORGOS","PAPASWTHRIOU",date4,1000,a1);
        Student stud2=new Student("IOANNIS","VRETOS",date5,1000,a2);
        Student stud3=new Student("MICHAELA","KALAMARA",date6,1000,a3);
        Student stud4=new Student("KWSTAS","SPANOS",date7,1000,a4);
        Student stud5=new Student("VASILIS","OIKONOMOY",date8,1000,a5);
        Student stud6=new Student("KATERINA","DOUNA",date9,1000,a6);
        Student stud7=new Student("EVITA","STRATELOU",date10,1000,a1);
        Student stud8=new Student("LAZAROS","ANANIADIS",date11,1000,a2);
        Student stud9=new Student("FILIPPOS","ANDREOU",date12,1000,a3);
        Student stud10=new Student("GIORGOS","MPEGNIS",date13,1000,a4);
        Student stud11=new Student("THANASIS","GEROGIANNIS",date14,1000,a4);
        List<Student>java_students=new ArrayList<Student>();
        List<Student>python_students=new ArrayList<Student>();
        List<Student>csharp_students=new ArrayList<Student>();
        List<Student>jscript_students=new ArrayList<Student>();
        java_students.add(stud1);
        java_students.add(stud5);
        java_students.add(stud7);
        python_students.add(stud2);
        python_students.add(stud5);
        python_students.add(stud8);
        csharp_students.add(stud3);
        csharp_students.add(stud6);
        csharp_students.add(stud9);
        jscript_students.add(stud4);
        jscript_students.add(stud6);
        jscript_students.add(stud10);
        jscript_students.add(stud11);
        //course initialization
        Course course1=new Course("CB1","JAVA","FULL TIME",date1,date3,java_students,java_trainers,java_assignments);
        Course course2=new Course("CB2","PYTHON","FULL TIME",date1,date3,python_students,python_trainers,python_assignments);
        Course course3=new Course("CB3","C#","FULL TIME",date1,date3,csharp_students,csharp_trainers,csharp_assignments);
        Course course4=new Course("CB4","JSCRIPT","FULL TIME",date1,date3,jscript_students,jscript_trainers,jscript_assignments);
        List<Course> courses=new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        return courses;
        //Processes.mainProcess();
    }
    static void printMenu()
    {
        System.out.println(""
                + "For printing all Students press 1\n"
                + "For printing all Trainers press 2\n"
                + "For printing all Assignments press 3\n"
                + "For printing all Courses press 4\n"
                + "For printing all Students of a Course press 5\n"
                + "For printing all Trainers of a Course press 6\n"
                + "For printing all Assignments of a Course press 7\n"
                + "For prinring all Assignments per Student press 8\n"
                + "For printing Students to belong in many courses press 9\n"
                + "For exit prees 0");
        
    }  
   
}
