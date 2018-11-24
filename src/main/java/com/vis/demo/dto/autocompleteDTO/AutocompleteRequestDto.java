package com.vis.demo.dto.autocompleteDTO;

import java.io.Serializable;

public class AutocompleteRequestDto implements Serializable {

    private String searchTerm;

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
