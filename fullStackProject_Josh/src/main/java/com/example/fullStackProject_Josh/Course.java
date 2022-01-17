package com.example.fullStackProject_Josh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private String price;
    private String duration;
    private String summary;

    public Course(int id, String name, String location, String price, String duration, String summary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }
}
