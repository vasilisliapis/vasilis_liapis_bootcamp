function check_student()
{
    var x = document.getElementById("s_fname").value;
    var y = document.getElementById("s_lname").value;
    var z= document.getElementById("s_email").value;
    var selectedDate= document.getElementById("s_birth_date").value;
    var opt;
    var opts=[];
    for ( var i = 0; i < 4; i++ ) {
        opt = document.getElementById("s_courses").options[i];
        if ( opt.selected === true ) {
            opts.push(opt.value);
            
        }
        
    }
    if(x.length<4 || y.length<4)
    {
        alert("Το όνομα και το επίθετο πρέπει να έχουν πάνω απο 4 χαρακτήρες!");
    }
    else if( z<6 )
    {
        alert("δώσε σωστό email με 6 χαρακτήρες και πάνω και @ ");
    }
    else if(selectedDate=="")
    {
        alert("Δώσε μια ημερομηνία γέννησης !");
    }
    else if(opts.length<1)
    {
        alert("Επέλεξε τουλάχιστον ένα course !!");
    }
    else{
        var s="";
        for(var i=0;i<opts.length;i++)
        {
            s+=opts[i]+", ";
        }
        alert("Ο μαθητής "+x+" "+y+" καταχωρήθηκε με επιτυχία ! Θα παρακολουθήσει τα παρακάτω μαθήματα :"+s);
        document.getElementById('container').style.display='none'; 
    }
}; 

function check_teacher()
{
    var x = document.getElementById("t_fname").value;
    var y = document.getElementById("t_lname").value;
    var z= document.getElementById("t_email").value;
    var selectedDate= document.getElementById("t_birth_date").value;
    var opt;
    var opts=[];
    for ( var i = 0; i < 4; i++ ) {
        opt = document.getElementById("t_courses").options[i];
        if ( opt.selected === true ) {
            opts.push(opt.value);
            
        }
        
    }
    if(x.length<4 || y.length<4)
    {
        alert("Το όνομα και το επίθετο πρέπει να έχουν πάνω απο 4 χαρακτήρες!");
    }
    else if( z<6 )
    {
        alert("δώσε σωστό email με 6 χαρακτήρες και πάνω και @ ");
    }
    else if(selectedDate=="")
    {
        alert("Δώσε μια ημερομηνία γέννησης !");
    }
    else if(opts.length<1)
    {
        alert("Επέλεξε τουλάχιστον ένα course !!");
    }
    else{
        var s="";
        for(var i=0;i<opts.length;i++)
        {
            s+=opts[i]+", ";
        }
        alert("Ο δάσκαλος "+x+" "+y+" καταχωρήθηκε με επιτυχία ! Θα διδάξει τα παρακάτω μαθήματα :"+s);
        document.getElementById('container2').style.display='none';
    }
}; 
function check_course()
{
    var x = document.getElementById("c_title").value;
    var y = document.getElementById("c_type").value;
    var selected_start_Date= document.getElementById("c_start_date").value;
    var selected_end_Date= document.getElementById("c_end_date").value;
    if(x=="")
    {
        alert("Δώσε Τίτλο στο μάθημα !");
    }
    else if(y=="")
    {
        alert("Δώσε τον Τύπο μαθήματος πχ Full-Time η Part Time");
    }
    else if(selected_start_Date=="")
    {
        alert("Δώσε μια ημερομηνία έναρξης !");
    }
    else if(selected_end_Date=="")
    {
        alert("Δώσε μια ημερομηνία λήξης !");
    }
    else{
        alert("Το μάθημα"+x+" "+y+" προστέθηκε με επιτυχία !");
        document.getElementById('container3').style.display='none';
    }
};
function check_assignment()
{
    var x = document.getElementById("a_title").value;
    var y = document.getElementById("a_type").value;
    var selected_start_Date= document.getElementById("a_start_date").value;
    var selected_end_Date= document.getElementById("a_end_date").value;
    if(x=="")
    {
        alert("Δώσε Τίτλο στην εργασία !");
    }
    else if(y=="")
    {
        alert("Δώσε τον Τύπο της εργασίας πχ Full-Time η Part Time");
    }
    else if(selected_start_Date=="")
    {
        alert("Δώσε μια ημερομηνία έναρξης !");
    }
    else if(selected_end_Date=="")
    {
        alert("Δώσε μια ημερομηνία λήξης !");
    }
    else{
        alert("Η εγασία"+x+" "+y+" προστέθηκε με επιτυχία !");
        document.getElementById('container4').style.display='none';
    }
};