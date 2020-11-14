package briefproject;
import static java.lang.Integer.parseInt;
import java.util.*;
import java.text.*;

public class Manual_Initialization {
    
    public static List<Course> initialization()throws ParseException
    {
         List<Student>students=new ArrayList<Student>();
        List<Trainer>trainers=new ArrayList<Trainer>();
        List<Course>courses=new ArrayList<Course>();
        List<Assignment>assignments=new ArrayList<Assignment>();
        ArrayList<String> studentsList=new ArrayList<String>();
        ArrayList<String> trainersList=new ArrayList<String>();
        ArrayList<String> coursesList=new ArrayList<String>();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        String str,str1,str2,str3;
        int tuitions,oralMark,totalMark,trainersNum=0,counter;
        while(true)
        {
            System.out.println("Do you wanna create a Student if yes type anything if no type stop");
            str=sc.next();
            if(str.equals("stop"))
            {
                break;
            }
            sc.nextLine();//to destroy the /n character and allow me later to use nextLine properly
            Student student=new Student();
            ArrayList<String> studentsElements=new ArrayList<String>(Arrays.asList(str.split(" ")));
            studentsElements=Manual_Initialization.completeStudentsFields();
            studentsList.add(studentsElements.get(0)+" "+studentsElements.get(1));
            student.setFirstName(studentsElements.get(0));
            student.setLastName(studentsElements.get(1));
            Date date=sdf.parse(studentsElements.get(2));
            student.setDateOfBirth(date);
            tuitions=parseInt(studentsElements.get(3));
            student.setTuitionFees(tuitions);
            students.add(student);
        }               
        while(true)
        {
            System.out.println("Give the Title of the Course to stop creating Courses write stop");
            str1=sc.next();
            if(str1.equals("stop"))
            {
                break;
            }
            while(true)
            {
               System.out.println("give  the Stream of "+str1+" to stop creatin Streams write stop");
               str2=sc.next();
               if(str2.equals("stop"))
               {
                   break;
               }
               int choice;
               System.out.println("If "+str2+" has only Full Time press 1 if it has only Part Time press 2 if it has both press 3!");
               choice=sc.nextInt();
               if(choice==1)
               {
                   Date start_date=new Date();
                   Date end_date=new Date();
                   start_date=Manual_Initialization.takeAdate("Start Date of the course");
                   end_date=Manual_Initialization.takeAdate("End Date of the course");
                   Course course=new Course(str1,str2,"FULL TIME",start_date,end_date);
                   courses.add(course);
                   coursesList.add(str1+" "+str2+" "+"FULL TIME");
               }
               else if(choice==2)
               {
                   Date start_date=new Date();
                   Date end_date=new Date();
                   start_date=Manual_Initialization.takeAdate("Start Date of the course");
                   end_date=Manual_Initialization.takeAdate("End Date of the course");
                   Course course=new Course(str1,str2,"PART TIME",start_date,end_date);
                   courses.add(course);
                   coursesList.add(str1+" "+str2+" "+"PART TIME");
               }
               else if(choice==3)
               {
                   Date start_date1=new Date();
                   Date end_date1=new Date();
                   Date start_date2=new Date();
                   Date end_date2=new Date();
                   start_date1=Manual_Initialization.takeAdate("Start Date of the FULL TIME course");
                   end_date1=Manual_Initialization.takeAdate("End Date of the FULL TIMEcourse");
                   start_date2=Manual_Initialization.takeAdate("Start Date of the PART TIME course");
                   end_date2=Manual_Initialization.takeAdate("End Date of the PART TIME course");
                   Course course1=new Course(str1,str2,"FULL TIME",start_date1,end_date1);
                   Course course2=new Course(str1,str2,"PART TIME",start_date2,end_date2);
                   courses.add(course1);
                   courses.add(course2);
                   coursesList.add(str1+" "+str2+" "+"FULL TIME");
                   coursesList.add(str1+" "+str2+" "+"PART TIME");
               }
                
            }
            
        }
        sc.nextLine();   
        while(true)
        {
            System.out.println("Give the First Name, the Last Name and the Subject of the trainer for example (James Gosling Programmer)\nto stop write stop");
            str3=sc.nextLine();
            Trainer trainer=new Trainer();
            System.out.println(coursesList); 
            if(str3.equals("stop")&&trainersNum>=coursesList.size())
            {
                break;
            }
            else if(str3.equals("stop"))
            {
                System.out.println("You should give at least "+coursesList.size()+" trainers in order to train all the courses!So give again the name of the trainer!");
                str3=sc.nextLine();
            }
            ArrayList<String> trainersElements=new ArrayList<String>(Arrays.asList(str3.split(" ")));
            System.out.println(trainersElements);
            trainer.setFirstName(trainersElements.get(0));
            trainer.setLastName(trainersElements.get(1));
            trainer.setSubject(trainersElements.get(2));
            trainers.add(trainer);
            trainersNum++;
            System.out.println(trainersNum);
        }       
         while(true)
        {
            System.out.println("Give the Name of the Assignment to stop creating assignments write stop");
            Assignment ass=new Assignment();
            str=sc.next();
            if(str.equals("stop"))
            {
                break;
            }
            ass.setTitle(str);
            System.out.println("Give the description of the assignment");
            str=sc.next();
            ass.setDescription(str);
            System.out.println("give the date of the assignment");
            str=sc.next();
            Date date=sdf.parse(str);
            ass.setSubDateTime(date);
            assignments.add(ass);
            
        }
        sc.nextLine();
        for(Assignment a:assignments)
        {
            while(true)
            {
                counter=0;
                System.out.println("Write the Title, the Stream and the type of the course for Example(CB1 JAVA PART TIME)in which the following assignment refer to: "+a.getTitle());
                System.out.println(coursesList);
                str=sc.nextLine();
                ArrayList<String>coursesElements=new ArrayList<String>(Arrays.asList(str.split(" ")));
                for(Course c:courses)
                {
                    if(c.getTitle().equals(coursesElements.get(0))&&c.getStream().equals(coursesElements.get(1))&&c.getType().equals(coursesElements.get(2)+" "+coursesElements.get(3)))
                    {
                        c.setAssignments(a);
                        counter++;
                        break;
                    }
                }
                if(counter==1)
                {
                    break;
                }
                else{
                    System.out.println("You gave wrong input please try again!");
                }
                
            }
           
            
        }
        for(Student s:students)
        {
            for(Course c:courses)
            {
                System.out.println("Does "+ s.getFirstName()+" "+s.getLastName() +"participate in "+c.getTitle()+" "+c.getStream()+" "+c.getType()+" if he does write yes else write no");
                str=sc.next();
                if(str.equals("yes"))
                {
                      s.setCourses(c.getTitle());
                      c.setStudents(s);
                      for(Assignment a:c.getAssignments())
                      {
                          System.out.println("which was the oral mark of "+s.getFirstName()+" "+s.getLastName()+" in this assignment: "+a.getTitle());
                          oralMark=sc.nextInt();
                          a.setOralMark(oralMark);
                          System.out.println("which was the total mark of "+s.getFirstName()+" "+s.getLastName()+" in this assignment: "+a.getTitle());
                          totalMark=sc.nextInt();
                          a.setTotalMark(totalMark);
                      }       
                }
            }
        }   
        sc.nextLine();
        for(Trainer t:trainers)
        {
            while(true)
            {
                counter=0;
                System.out.println("Write the Title the Stream and the Type of the course in which "+t.getFirstName()+" "+t.getLastName()+" trains for example(CB1 JAVA FULL TIME)");
                System.out.println(coursesList);
                str=sc.nextLine();
                System.out.println(str);
                ArrayList<String> trainersCourses=new ArrayList<String>(Arrays.asList(str.split(" ")));
                System.out.println(str);
                for(Course c:courses)
                {
                    if(c.getTitle().equals(trainersCourses.get(0))&&c.getStream().equals(trainersCourses.get(1))&&c.getType().equals(trainersCourses.get(2)+" "+trainersCourses.get(3)))
                    {
                        c.setTrainers(t);
                        counter++;
                        break;
                    }
                }
                if(counter==1)
                {
                    break;
                }
                else
                {
                    System.out.println("You gave wrong input try again!");
                }
            }
           
        }
        return courses;
    }
    static Date takeAdate(String s)throws ParseException
    {
        String str;
        System.out.println("Type the "+s+" in this Format : dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        if(!str.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"))
        {
            return takeAdate(s);
        }
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(str);
        return date;
    }
    //completeStudentsFields uses recursion if the user gives wrong input to take a new input!!
    static ArrayList<String> completeStudentsFields()
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Give the First Name, the Last Name, the Date of Birth and the Tuitions(number) of the students\nfor Example(KWSTAS DAVRIS 01/01/1997 1000)");
        str=sc.nextLine();
        ArrayList<String> studentsElements=new ArrayList<String>(Arrays.asList(str.split(" ")));
        if(studentsElements.size()!=4)
        {
            System.out.println("You completed the method wrong do it again !");
            studentsElements=completeStudentsFields();
            return studentsElements;
        }
        boolean isNumeric =studentsElements.get(3).chars().allMatch(Character::isDigit);
        if(!isNumeric)
        {
            System.out.println("You completed the method wrong Tuitions must be a NUMBER do it again  !");
            studentsElements=completeStudentsFields();
            return studentsElements;
        }
        return studentsElements;
    }
    static int isNumeric()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s = sc.next();
        boolean isNumber= s.chars().allMatch( Character::isDigit );
        if(isNumber)
        {
            return parseInt(s);
        }
        else
        {
            System.out.println("You should give a NUMBER try again");
            return isNumeric();
        }
        
    }
   

   
    
}
