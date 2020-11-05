package individualProject;
import java.util.*;

public class Init {
    String name;
    
    static List<Course> initialization()
    {
        Assignment as1=new Assignment("ecxersice_java");
        Assignment as2=new Assignment("ecxersice_c#");
        Assignment as3=new Assignment("ecxersice_python");
        Assignment as4=new Assignment("ecxersice_jscript");
        List<Assignment> as1List=new ArrayList<Assignment>();
        List<Assignment> as2List=new ArrayList<Assignment>();
        List<Assignment> as3List=new ArrayList<Assignment>();
        List<Assignment> as4List=new ArrayList<Assignment>();
        List<Assignment> as5List=new ArrayList<Assignment>();
        List<Assignment> as6List=new ArrayList<Assignment>();
        as1List.add(as1);
        as2List.add(as2);
        as3List.add(as3);
        as4List.add(as4);
        as5List.add(as1);
        as5List.add(as3);
        as6List.add(as2);
        as6List.add(as4);
        //lists of courses
        ArrayList<String> a1=new ArrayList<String>(Arrays.asList("JAVA"));
        ArrayList<String> a2=new ArrayList<String>(Arrays.asList("C#"));
        ArrayList<String> a3=new ArrayList<String>(Arrays.asList("PYTHON"));
        ArrayList<String> a4=new ArrayList<String>(Arrays.asList("JSCRIPT"));
        ArrayList<String> a5=new ArrayList<String>();
        ArrayList<String> a6=new ArrayList<String>();
        a5.addAll(a3);
        a5.addAll(a1);
        a6.addAll(a2);
        a6.addAll(a4);
         //Initializing the Students
        Student s1=new Student("Vasilis",1,a5,as5List);
        Student s2=new Student("Giorgos",2,a1,as1List);
        Student s3=new Student("Kwstas",3,a2,as2List);
        Student s4=new Student("Maria",4,a6,as6List);
        Student s5=new Student("Afroditi",5,a3,as3List);
        Student s6=new Student("Eleanna",6,a3,as3List);
        Student s7=new Student("Tasos",7,a3,as3List);
        Student s8=new Student("Kwstas",8,a4,as4List);
        Student s9=new Student("Giorgos",9,a4,as4List);
        Student s10=new Student("Giannis",10,a4,as4List);
        Student s11=new Student("Stelios",11,a4,as4List);
        //making Java list
        List<Student> java_students=new ArrayList<Student>();
        java_students.add(s1);
        java_students.add(s2);
        //making C# list
        List<Student> csharp_students=new ArrayList<Student>();
        csharp_students.add(s3);
        csharp_students.add(s4);
        //making Python list
        List<Student> python_students=new ArrayList<Student>();
        python_students.add(s1);
        python_students.add(s5);
        python_students.add(s6);
        python_students.add(s7);
        //making Jscript list
        List<Student> jscript_students=new ArrayList<Student>();
        jscript_students.add(s4);
        jscript_students.add(s8);
        jscript_students.add(s9);
        jscript_students.add(s10);
        jscript_students.add(s11);
        
        Trainer t1=new Trainer("Andreas","JAVA");
        Trainer t2=new Trainer("Hlias","C#");
        Trainer t3=new Trainer("Eleni","PYTHON");
        Trainer t4=new Trainer("Thanasis","JSCRIPT");
        Trainer t5=new Trainer("Eleni","JAVA");
        
        List<Trainer> java_trainers=new ArrayList<Trainer>();
        java_trainers.add(t1);
        java_trainers.add(t5);
        List<Trainer> csharp_trainers=new ArrayList<Trainer>();
        csharp_trainers.add(t2);
        List<Trainer> python_trainers=new ArrayList<Trainer>();
        python_trainers.add(t3);
        List<Trainer> jscript_trainers=new ArrayList<Trainer>();
        jscript_trainers.add(t4);
        
        Course java=new Course("JAVA",java_students,java_trainers,as1List);
        Course csharp=new Course("C#",csharp_students,csharp_trainers,as2List);
        Course python=new Course("PYTHON",python_students,python_trainers,as3List);
        Course jscript=new Course("JSCRIPT",jscript_students,jscript_trainers,as4List);
        
        List<Course> courses=new ArrayList<Course>();
        courses.add(java);
        courses.add(csharp);
        courses.add(python);
        courses.add(jscript);
        return courses;
    }
    //Printing menu
    static void printMenu()
    {
        System.out.println(""
                + "For printing all Students press 1\n"
                + "For printing all Trainers press 2\n"
                + "For printing all courses press 3\n"
                + "For printing all students of a course press 4\n"
                + "For printing all trainers of a course press5\n"
                + "For printing Students to belong in many courses press 6\n"
                + "For prinring all Assignments per Student press 7\n"
                + "For printing all Assignments of a Course press 8\n"
                + "For exit prees 0");
        
    }  
}
