$(document).ready(function(){
    var counter1= 0;
    var counter2= 0;
    var counter3= 0;
    var counter4=0;
    var counter5=0;
    var counter6=0;
    var counter7=0;
    $(".student").on({

        mouseenter:function(){
            $(".opt1").children().slideDown();
        },
        mouseleave:function(){
            $(".opt1").children().slideUp();
        }
    });
    $(".teacher").on({

        mouseenter:function(){
            $(".opt2").children().slideDown();
        },
        mouseleave:function(){
            $(".opt2").children().slideUp();
        }
    });
    $(".course").on({

        mouseenter:function(){
            $(".opt3").children().slideDown();
        },
        mouseleave:function(){
            $(".opt3").children().slideUp();
        }
    });
    $(".assignments").on({

        mouseenter:function(){
            $(".opt4").children().slideDown();
        },
        mouseleave:function(){
            $(".opt4").children().slideUp();
        }
    });
    console.log("Hello world!");
    $("#btn1").click(function(){
        $("#container").slideDown();
    });
    $(".cancel_button").click(function(){
        $("#container").slideUp();
        $("#container2").slideUp();
        $("#container3").slideUp();
        $("#container4").slideUp();
    });
    $("#btn2").click(function(){
        $("#container2").slideDown(500);
    });
    $("#btn3").click(function(){
        $("#container3").slideDown(500);
    });
    $("#btn4").click(function(){
        $("#container4").slideDown(500);
    });
    // $("#btn5").click(function(){
    //     // getElementsByClassName("containers").style.height="200px";
    //     $(".containers").css("height","200px");
    //     $(".project_options").slideDown(500);

    // });
    $("#btn5").click(function(){
        counter1+=1;
        if(counter1%2==1)
        {
            $(".containers").css("height","200px");
            $(".project_options").toggle();
        }
        else
        {
            $(".containers").css("height","70px");
        }
        // $(".project_options").toggle();
    });
    $("#btn6").click(function(){
        counter2+=1;
        if(counter2%2==1)
        {
            $(".containers").css("height","200px");
            $(".project_options").toggle();
        }
        else
        {
            $(".containers").css("height","70px");
        }
        // $(".project_options").toggle();
    });  
    $("#btn7").click(function(){
        counter3+=1;
        if(counter3%2==1)
        {
            $(".containers").css("height","250px");
        }
        else
        {
            $(".containers").css("height","70px");
        }
        $(".project_options").toggle();
    });  
    $("#btn8").click(function(){
        counter4+=1;
        if(counter4%2==1)
        {
            $(".containers").css("height","300px");
        }
        else
        {
            $(".containers").css("height","200px");
        }
        counter4=0;
        $(".project_more_options").toggle();
    }); 
    $("#btn9").click(function(){
        counter5+=1;
        if(counter5%2==1)
        {
            $(".containers").css("height","300px");
        }
        else
        {
            $(".containers").css("height","200px");
        }
        $(".project_more_options").toggle();
    });
    $("#btn10").click(function(){
        counter6+=1;
        if(counter6%2==1)
        {
            $(".containers").css("height","300px");
        }
        else
        {
            $(".containers").css("height","200px");
        }
        $(".project_more_options").toggle();
    });    
    $("#btn11").click(function(){
        counter7+=1;
        if(counter7%2==1)
        {
            $(".containers").css("height","300px");
        }
        else
        {
            $(".containers").css("height","200px");
        }
        $(".project_more_options").toggle();
    });         
//************************************************************************************************************** */
//-----------------------------DATABASE-------------------------------//
//students initialization


})
