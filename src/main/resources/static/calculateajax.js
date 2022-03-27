function calculate() {

 var lenght = $("#period").val();

    var wklad = $("#wklad").val();

    var car = $("#car").val();

     var check = $("#check").is(':checked');

/*var installment = (1.2*(car-wklad))/lenght) ;*/


        var object = {

        lenght: lenght,
        wklad: wklad,
        car: car,
        check: check,
        }

        $.ajax({
            url: "http://localhost:8080/endpoint",
            method: "POST",
            dataType: "json",
            contentType: "application/json",
            data: JSON.stringify(object)
        })
        .done(res => {
                 $('#divInstallment').html(res.installment);
             
               /*  alert(res.installment);
*/
        });


}