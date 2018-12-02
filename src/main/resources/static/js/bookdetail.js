$(document).ready(function () {
    initSubscriptionAjax();
    initReservationAjax();
});

function initSubscriptionAjax() {
    $('#SubscriptionButton').on('click',function(){
        // var subscriptionDto = { bookId : bookId };
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "/make/subscription",
                data : JSON.stringify(bookId),
                success: function() {
                    $('#SubscriptionButton').attr("disabled", true)
                    alert("Sledování bylo úspěšně přidána");

                },
                error: function (xhr, status, error) {
                    alert('Something went wrong :(' );
                    console.log( xhr,status,error);

                }
            })

        }
    )
}

function initReservationAjax() {
    $('#ReservationButton').on('click',function(){
            // var subscriptionDto = { bookId : bookId };
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: "/make/reservation",
                data : JSON.stringify(bookId),
                success: function() {
                    $('#ReservationButton').attr("disabled", true)
                    alert("Sledování bylo úspěšně přidána");


                },
                error: function (xhr, status, error) {
                    alert('Something went wrong :(' );
                    console.log( xhr,status,error);

                }
            })

        }
    )
}