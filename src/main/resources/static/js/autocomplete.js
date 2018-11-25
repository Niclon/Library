/**
 * Global array for storing all currently running Autocomplete Ajax queries. These queries will be aborted when
 * user closes the Select2 selectbox.
 *
 * @type {Array}
 */
var runningAutocompleteAjaxQueries = [];

function initAutocomplete(selector, url, enableAddingNewValues) {
    $(function () {
        // has any result been matched by search
        var hasData = false;
        $(selector).select2({
            //Does the user have to enter any data before sending the ajax request
            minimumInputLength: 1,
            ajax: {
                //How long the user has to pause their typing before sending the next request
                delay: 250,
                //The url of the json service
                url: url,
                dataType: 'json',
                //Our search term and what page we are on
                data: function (params) {
                    return {
                        searchTerm: params.term
                    };
                },
                //Convert the returned result to Select2 format
                processResults: function (data) {
                    hasData = data.results.length !== 0;
                    return {
                        results: data.results
                    };
                }
            },
            //enable inserting new values
            tags: enableAddingNewValues,
            createTag: function (params) {
                //creation of new tag will be allowed only if it's email and if no other data were matched
                if (params.term && !hasData) {
                    return {
                        id: params.term,
                        name: params.term,
                        newOption: true
                    }
                }
                return null;
            },
            templateResult: function (data) {
                var $result = $("<span></span>");

                $result.text(data.name);

                if (data.newOption) {
                    $result.append(" <em>(new)</em>");
                }

                return $result;
            }
        }).on("select2:close", function () {
            abortAutocompleteAjaxQueries();
        });
    });
}

function abortAutocompleteAjaxQueries() {
    runningAutocompleteAjaxQueries.forEach(function (jqxhr) {
        jqxhr.abort();
    });
    runningAutocompleteAjaxQueries = [];
}

$(document).ajaxSend(function (event, jqxhr, settings) {
    if (settings.url.startsWith("/rest/autocomplete")) {
        runningAutocompleteAjaxQueries.push(jqxhr);
    }
});

$(document).ajaxComplete(function () {
    runningAutocompleteAjaxQueries = runningAutocompleteAjaxQueries.filter(function (x) {
        return x.readyState < 4
    });
});