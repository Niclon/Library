package com.vis.demo.dto.autocompleteDTO;

import java.util.List;

public class AutocompleteResponseDto {
    private List<AutocompleteItemDto> results;

    public AutocompleteResponseDto() {
    }

    public AutocompleteResponseDto(List<AutocompleteItemDto> results) {

        this.results = results;
    }

    public List<AutocompleteItemDto> getResults() {
        return results;
    }

    public void setResults(List<AutocompleteItemDto> results) {
        this.results = results;
    }
}
