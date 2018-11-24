package com.vis.demo.dto.autocompleteDTO;

import java.io.Serializable;

public class AutocompleteItemDto implements Serializable {

    private String id;
    private String name;

    public AutocompleteItemDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
