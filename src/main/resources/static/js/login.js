
function createAjaxLoginRequest() {
    var email = $('#email').val();
    var password = $('#password').val();
    var loginDto = {
        email: email,
        password: password
    };

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/account/login",
        data : JSON.stringify(loginDto),
        success: function() {
            setTimeout(function(){ window.location.href = "http://localhost:8090/"; }, 1500);
            alert("Přihlášení proběhlo úspěšně");


        },
        error: function (xhr, status, error) {
            alert('Špatné jméno nebo heslo' );

        }
    })
}