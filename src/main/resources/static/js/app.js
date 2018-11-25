$(document).ready(function () {
    // initSelect2("#bookSearch");
    initAutocomplete("#bookSearch","/rest/autocomplete/allbooks",false);
});

function initSelect2(selector) {
    $(selector).select2();
}