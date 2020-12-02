//students initialization
function Student(f_name,l_name,email,birth_date)
{
    this.f_name=f_name;
    this.l_name=l_name;
    this.email=email;
    this.birth_date=birth_date;

}
function students_init(students_list,programming_stud_list,english_stud_list,maths_stud_list,physics_stud_list)
{
var s1=new Student("Βασίλης","Οικονόμου","bill_oiko@gmail.com","15/05/1998");
var s2=new Student("Γιώργος","Κατσιφής","geo_kats@gmail.com","08/02/1995");
var s3=new Student("Μαρία","Παππά","maria_papa@gmail.com","06/06/1994");
var s4=new Student("Ελένη","Δάρρα","eleni_darra@gmail.com","21/08/1997");
var s5=new Student("Κώστας","Παντελής","kwstas_pant@gmail.com","07/11/1996");
var s6=new Student("Δήμητρα","Ράπτη","dimi_rapti@gmail.com","11/04/1992");
var s7=new Student("Θανάσης","Θεοδορόπουλος","thanasis_theo@gmail.com","14/06/1995");
var s8=new Student("Κατερίνα","Ματθαίου","katerina_math@gmail.com","01/12/1999");
var s9=new Student("Στέλλα","Παπαχαραλάμπους","stella_papa@gmail.com","30/07/1991");
var s10=new Student("Σωτήρης","Χατζής","sotiris_hatzis@gmail.com","26/05/1995");
// list of all students init
students_list.push(s1);
students_list.push(s2);
students_list.push(s3);
students_list.push(s4);
students_list.push(s5);
students_list.push(s6);
students_list.push(s7);
students_list.push(s8);
students_list.push(s9);
students_list.push(s10);
//programminig init
programming_stud_list.push(s1);
programming_stud_list.push(s2);
programming_stud_list.push(s3);
//english init
english_stud_list.push(s4);
english_stud_list.push(s5);
english_stud_list.push(s8);
english_stud_list.push(s9);
english_stud_list.push(s10);
english_stud_list.push(s1);
//maths init
maths_stud_list.push(s6);
maths_stud_list.push(s7);
//physics init
physics_stud_list.push(s7);
physics_stud_list.push(s8);
}
//trainers initialization
function Trainer(f_name,l_name,subject)
{
    this.f_name=f_name;
    this.l_name=l_name;
    this.subject=subject;
}
function trainers_init(trainers_list,programming_train_list,english_train_list,maths_train_list,physics_train_list)
{
    var t1=new Trainer("Ανδρέας","Σιμονοβίκης","Προγραμματισμός");
    var t2=new Trainer("Ηλίας","Κωνσταντίνου","Προγραμματισμός");
    var t3=new Trainer("Σωτηρία","Στούμπου","Αγγλικά");
    var t4=new Trainer("Ιωάννης","Σερετίδης","Μαθηματικά");
    var t5=new Trainer("Φωτεινή","Αντωνίου","Φυσική");
    var t6=new Trainer("Σοφία","Μαραγκού","Αγγλικά");
    // var trainers_list=[];
    trainers_list.push(t1);
    trainers_list.push(t2);
    trainers_list.push(t3);
    trainers_list.push(t4);
    trainers_list.push(t5);
    trainers_list.push(t6);
    // var programming_train_list=[];
    programming_train_list.push(t1);
    programming_train_list.push(t2);
    // var english_train_list=[];
    english_train_list.push(t3);
    english_train_list.push(t6);
    // var maths_train_list=[];
    maths_train_list.push(t4);
    // var physics_train_list=[];
    physics_train_list.push(t5);
    
}
//assignments initialization
function Assignment(title,type,start_date,end_date)
{
    this.title=title;
    this.type=type;
    this.start_date=start_date;
    this.end_date=end_date;
}
function assignments_init(assignments_list,programming_assigns_list,english_assigns_list,maths_assigns_list,physics_assigns_list,s1_assigns_list,s2_assigns_list,s3_assigns_list)
{
    var a1=new Assignment("ex1","programming","20/10/2020","30/10/2020");
    var a2=new Assignment("ex1","english","15/10/2020","25/10/2020");
    var a3=new Assignment("ex1","maths","10/09/2020","01/10/2020");
    var a4=new Assignment("ex1","physics","08/11/2020","22/11/2020");
    // var assignments_list=[];
    assignments_list.push(a1);
    assignments_list.push(a2);
    assignments_list.push(a3);
    assignments_list.push(a4);
    // var programming_assigns_list=[];
    programming_assigns_list.push(a1);
    // var english_assigns_list=[];
    english_assigns_list.push(a2);
    // var maths_assigns_list=[];
    maths_assigns_list.push(a3);
    // var physics_assigns_list=[];
    physics_assigns_list.push(a4);
    //
    s1_assigns_list.push(a1);
    s1_assigns_list.push(a2);
    //
    s2_assigns_list.push(a3);
    s2_assigns_list.push(a4);
    //
    s3_assigns_list.push(a2);
    s3_assigns_list.push(a4);

}
//courses initialization
function Course(title,type,start_date,end_date,students,trainers,assignments)
{
    this.title=title;
    this.type=type;
    this.start_date=start_date;
    this.end_date=end_date;
    this.students=students;
    this.trainers=trainers;
    this.assignments=assignments;
}
function course_init(courses_list)
{
    var c1=new Course("Java","full-time","15/09/2020","25/12/2020",programming_stud_list,programming_train_list,programming_assigns_list);
    var c2=new Course("English","full-time","15/09/2020","22/12/2020",english_stud_list,english_train_list,english_assigns_list);
    var c3=new Course("Maths","part-time","10/09/2020","20/12/2020",maths_stud_list,maths_train_list,maths_assigns_list);
    var c4=new Course("Physics","part-time","01/10/2020","10/01/2021",physics_stud_list,physics_train_list,physics_assigns_list);
    courses_list.push(c1);
    courses_list.push(c2);
    courses_list.push(c3);
    courses_list.push(c4);
}


var students_list=[];
var programming_stud_list=[];
var english_stud_list=[];
var maths_stud_list=[];
var physics_stud_list=[];
students_init(students_list,programming_stud_list,english_stud_list,maths_stud_list,physics_stud_list);
//trainers init
var trainers_list=[];
var programming_train_list=[];
var english_train_list=[];
var maths_train_list=[];
var physics_train_list=[];
trainers_init(trainers_list,programming_train_list,english_train_list,maths_train_list,physics_train_list);
//assignments init
var assignments_list=[];
var programming_assigns_list=[];
var english_assigns_list=[];
var maths_assigns_list=[];
var physics_assigns_list=[];
var s1_assigns_list=[];
var s2_assigns_list=[];
var s3_assigns_list=[];
assignments_init(assignments_list,programming_assigns_list,english_assigns_list,maths_assigns_list,physics_assigns_list,s1_assigns_list,s2_assigns_list,s3_assigns_list);
//course init
var courses_list=[];
course_init(courses_list);





var i;

function all_students_table(x)
{
    document.getElementById('myTable').style.visibility='visible';
    var len=x.length;
    var table = document.getElementById("myTable");
    while(table.hasChildNodes())
    {
        table.removeChild(table.firstChild);
    }
          var row1=table.insertRow(0);
          var cell1 = row1.insertCell(0);
          var cell2 = row1.insertCell(1);
          var cell3 = row1.insertCell(2);
          var cell4 = row1.insertCell(3);
          cell1.innerHTML="Όνομα"; 
          cell2.innerHTML="Επίθετο";
          cell3.innerHTML="Email"; 
          cell4.innerHTML="Ημ.Γέννησης";
    for(i=0;i<len;i++)
    {
        var row=table.insertRow(i+1);
        var cell5=row.insertCell(0);
        var cell6=row.insertCell(1);
        var cell7=row.insertCell(2);
        var cell8=row.insertCell(3);
        cell5.innerHTML=x[i].f_name;
        cell6.innerHTML=x[i].l_name;
        cell7.innerHTML=x[i].email;
        cell8.innerHTML=x[i].birth_date;
    }
    document.getElementById('table_buttons').style.display='block'; 
}
function all_trainers_table(x)
{  
    document.getElementById('myTable').style.visibility='visible';
    var len=x.length;
    var table = document.getElementById("myTable");
    while(table.hasChildNodes())
    {
        table.removeChild(table.firstChild);
    }
          var row1=table.insertRow(0);
          var cell1 = row1.insertCell(0);
          var cell2 = row1.insertCell(1);
          var cell3 = row1.insertCell(2);
          cell1.innerHTML="Όνομα"; 
          cell2.innerHTML="Επίθετο";
          cell3.innerHTML="Αντικείμενο"; 
    for(i=0;i<len;i++)
    {
        var row=table.insertRow(i+1);
        var cell4=row.insertCell(0);
        var cell5=row.insertCell(1);
        var cell6=row.insertCell(2);
        cell4.innerHTML=x[i].f_name;
        cell5.innerHTML=x[i].l_name;
        cell6.innerHTML=x[i].subject;
    }
    document.getElementById('table_buttons').style.display='block'; 
}
function all_assignments_table(x)
{
    document.getElementById('myTable').style.visibility='visible';
    var len=x.length;
    var table = document.getElementById("myTable");
    while(table.hasChildNodes())
    {
        table.removeChild(table.firstChild);
    }
          var row1=table.insertRow(0);
          var cell1 = row1.insertCell(0);
          var cell2 = row1.insertCell(1);
          var cell3 = row1.insertCell(2);
          var cell4 = row1.insertCell(3);
          cell1.innerHTML="Τίτλος"; 
          cell2.innerHTML="Τύπος";
          cell3.innerHTML="Ημ.Έναρξης"; 
          cell4.innerHTML="Ημ.Λήξης";
    for(i=0;i<len;i++)
    {
        var row=table.insertRow(i+1);
        var cell5=row.insertCell(0);
        var cell6=row.insertCell(1);
        var cell7=row.insertCell(2);
        var cell8=row.insertCell(3);
        cell5.innerHTML=x[i].title;
        cell6.innerHTML=x[i].type;
        cell7.innerHTML=x[i].start_date;
        cell8.innerHTML=x[i].end_date;
    }
    document.getElementById('table_buttons').style.display='block'; 
}
function course_table()
{
    document.getElementById('myTable').style.visibility='visible';
    var table = document.getElementById("myTable");
    while(table.hasChildNodes())
    {
        table.removeChild(table.firstChild);
    }
          var row1=table.insertRow(0);
          var cell1 = row1.insertCell(0);
          var cell2 = row1.insertCell(1);
          var cell3 = row1.insertCell(2);
          var cell4 = row1.insertCell(3);
          cell1.innerHTML="Τίτλος"; 
          cell2.innerHTML="Τύπος";
          cell3.innerHTML="Ημ.Έναρξης"; 
          cell4.innerHTML="Ημ.Λήξης";
    for(i=0;i<courses_list.length;i++)
    {
        var row=table.insertRow(i+1);
        var cell5=row.insertCell(0);
        var cell6=row.insertCell(1);
        var cell7=row.insertCell(2);
        var cell8=row.insertCell(3);
        cell5.innerHTML=courses_list[i].title;
        cell6.innerHTML=courses_list[i].type;
        cell7.innerHTML=courses_list[i].start_date;
        cell8.innerHTML=courses_list[i].end_date;
    }
    document.getElementById('table_buttons').style.display='block'; 
}
//καλεί την coursetable για να εκτυπώσει ολα τα μαθήματα
document.getElementById("btn22").addEventListener("click",course_table);

//καλεί all_students_table για να εκτυπώσει την ανάλογη λίστα μαθητών
function check1(x){
    if(x==1)
    {
        all_students_table(students_list);
    }
    if(x==2)
    {
        all_students_table(programming_stud_list);
    }
    if(x==3)
    {
        all_students_table(english_stud_list);
    }
    if(x==4)
    {
        all_students_table(maths_stud_list);
    }
    if(x==5)
    {
        all_students_table(physics_stud_list);
    }
}
//καλεί all_trainers_table για να εκτυπώσει την ανάλογη λίστα δασκάλων
function check2(x){
    if(x==1)
    {
        all_trainers_table(trainers_list);
    }
    if(x==2)
    {
        all_trainers_table(programming_train_list);
    }
    if(x==3)
    {
        all_trainers_table(english_train_list);
    }
    if(x==4)
    {
        all_trainers_table(maths_train_list);
    }
    if(x==5)
    {
        all_trainers_table(physics_train_list);
    }
}
//καλεί all_assignments_table για να εκτυπώσει την ανάλογη λίστα εργασιών
function check3(x){
    if(x==1)
    {
        all_assignments_table(assignments_list);
    }
    if(x==2)
    {
        all_assignments_table(programming_assigns_list);
    }
    if(x==3)
    {
        all_assignments_table(english_assigns_list);
    }
    if(x==4)
    {
        all_assignments_table(maths_assigns_list);
    }
    if(x==5)
    {
        all_assignments_table(physics_assigns_list);
    }
    if(x==6)
    {
        all_assignments_table(s1_assigns_list);
    }
    if(x==7)
    {
        all_assignments_table(s2_assigns_list);
    }
    if(x==8)
    {
        all_assignments_table(s3_assigns_list);
    }
}


// function display_buttons() {
//    document.getElementById('table_buttons').style.display = 'block'; 
//   }
function hide_table()
{
    document.getElementById('myTable').style.visibility='hidden';
    document.getElementById('table_buttons').style.display='none';
}
function sub_table()
{
    document.getElementById('myTable').style.visibility='hidden';
    document.getElementById('table_buttons').style.display='none';
    alert("Οι αλλαγές καταχωρήθηκαν");
}

function edit_table()
{
    var t = document.getElementById('myTable');
    var trs = t.getElementsByTagName("tr");
    var tds = null;

    for (var i=0; i<trs.length; i++)
    {
        tds = trs[i].getElementsByTagName("td");
        for (var n=0; n<tds.length;n++)
        {
            tds[n].contentEditable = "true";
        }
    }
}