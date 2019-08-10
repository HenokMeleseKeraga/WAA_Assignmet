$(document).ready(function () {

    // change form to JS to JSON

    $( 'form').submit(function(event) {
        event.preventDefault();
        let jsonObj={};
        let array=$( this ).serializeArray();
        $.each(array,function () {
            jsonObj[this.name]=this.value;
        })
        console.log(array );
        console.log( jsonObj );
        let formJSON=JSON.stringify(jsonObj)
        console.log(formJSON);
        $.ajax({
                type:'POST',
                 url:'http://127.0.0.1:9050/add',
                 data:formJSON,
                  contentType: "application/json",
                  dataType: "json",
                  success: result,
                  error:errResult
            }

        );
        function result(response, status, request) {
            // console.log("response :"+ response.firstName);
            // console.log("status :"+ status);
            // console.log("request : " +request.firstName);
            let fName=response.firstName;
            let lName=response.lastName;
            let email=response.email;
            // let rstForm='<h4>ADD Employee</h4><h4>First Name :';
            // rstForm+=fName+'</h4><h4> Last Name :';
            // rstForm+=lName+'</h4><h4> Email :';
            // rstForm+=email+'</h4>';
            // $('#mainContent').append(rstForm);
            // $('#inputForm').empty();

            $('#formInput').html("");
            $("#formInput").append( '<H3 align="center"> New Employee Information <H3>');
            $('#formInput').append("<H4 align='center'>First Name:  " + fName  + "</h4>"  );
            $('#formInput').append("<H4 align='center'>Last Name: " +  lName + "</h4>" );
            $('#formInput').append("<H4 align='center'>Email: " +  email + "</h4>");
            $("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
            make_visible('formInput');
            make_hidden('errors');

        }
        toggle_visibility = function(id) {
            var element = document.getElementById(id);
            if(element.style.display == 'block')
                element.style.display = 'none';
            else
                element.style.display = 'block';
        }

        make_hidden = function(id) {
            var element = document.getElementById(id);
            element.style.display = 'none';
        }

        make_visible = function(id) {
            var element = document.getElementById(id);
            element.style.display = 'block';
        }

        resetForm = function(id) {
            var element = document.getElementById(id);
            $(element)[0].reset();

        }

        function errResult(request, status, error) {
            console.log("error") ;
            console.log("request :"+ request.responseJSON.errType);
            console.log("status :"+ status);
            console.log("error : "+  error);
            let respJS=request.responseJSON;
            $('#errors').empty();
            if(respJS.errType==='ValidationError'){
                console.log("errf.message");
                let fieldJS=respJS.fieldErrorDTOList;
                let errmsg='<h3>Errors</h3><p>';
               $.each(fieldJS,function (index,error) {
                   console.log(error.fieldName);
                   $('#'+error.fieldName+'>.errmsg').empty();
                    $('#'+error.fieldName).append('<span class="errmsg">'+error.message+'</span>').show();
                   errmsg+=error.message+'</p><p>'
                })
                errmsg+='</p>';
              $('#errors').append(errmsg);


            }else{
                console.log("no valiation exception ")
            }
        }

    });


});
