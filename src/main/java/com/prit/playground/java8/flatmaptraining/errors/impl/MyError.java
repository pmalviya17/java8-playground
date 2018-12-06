package com.prit.playground.java8.flatmaptraining.errors.impl;

import com.prit.playground.java8.flatmaptraining.errors.GenericError;

public class MyError implements GenericError {

    private final String description;

    public MyError(String description) {
        super();
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MyError [description=" + description + "]";
    }

}
