$(document).ready(function (){
    $.ajax({
        url: "http://localhost:8080/conference/user"
    }).then(function (data){
        $('.firstName').append(data.firstname);
        $('.lastName').append(data.lastname);
        $('.age').append(data.age);
    });
});