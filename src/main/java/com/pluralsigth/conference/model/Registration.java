package com.pluralsigth.conference.model;

import javax.validation.constraints.NotEmpty;

public class Registration {
    @NotEmpty
    private String name;

    public Registration(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
