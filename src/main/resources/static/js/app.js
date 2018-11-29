$(document).ready(function () {
    // initSelect2("#bookSearch");
    // initAutocomplete("#bookSearch","/rest/autocomplete/allbooks",false);
    initAutocomplete("#bookSearch","/rest/autocomplete/books",false);
    addSelect2Event();
});

function addSelect2Event() {
    $(document).on('mouseup', '.select2-container--open .select2-results__option', function (e) {
        window.location.href += "bookdetail/" + $('#bookSearch').val();
    });
}