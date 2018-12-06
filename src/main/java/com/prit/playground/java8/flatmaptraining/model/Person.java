package com.prit.playground.java8.flatmaptraining.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class Person {

    private String name;
    private int age;
    private List<String> skills;

    public Person addSkill(String skill) {
        if(this.skills == null) {
            this.skills = new ArrayList();
            this.skills.add(skill);
        } else {
            this.skills.add(skill);
        }

        return this;
    }
}
