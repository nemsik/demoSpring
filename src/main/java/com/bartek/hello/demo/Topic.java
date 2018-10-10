package com.bartek.hello.demo;

import javax.persistence.*;

@Entity
@Table (name = "topic_table")
public class Topic {

    @Id
    private int id;
    private String description;

    public Topic() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
