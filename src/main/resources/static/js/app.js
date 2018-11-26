$(document).ready(function () {
    // initSelect2("#bookSearch");
    // initAutocomplete("#bookSearch","/rest/autocomplete/allbooks",false);
    initAutocomplete("#bookSearch","/rest/autocomplete/books",false);
});

function initSelect2(selector) {
    $(selector).select2();
}