
function createAjaxLoginRequest() {
    var email = $('#email').val();
    var password = $('#password').val();
    console.log("clicked");
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
            alert("Přihlášení proběhlo úspěšně");
            window.location.replace("localhost:8090/");
        },
        error: function (xhr, status, error) {
            // alert('Špatné jméno nebo heslo' );

        }
    })
}