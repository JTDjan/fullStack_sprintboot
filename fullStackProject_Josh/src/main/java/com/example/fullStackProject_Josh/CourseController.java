package com.example.fullStackProject_Josh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    ArrayList<String> courses = new ArrayList<>(Arrays.asList("Java Class", "React Class", "HTML/CSS Class"));
    // 3 endpoints ( List of courses/ single course/ post to add course )

    //List of course
    @GetMapping("/courses")
    public List<String> sayHi() {
        return courses;
    }

    // single course
    @GetMapping("/courses/{course}")
    public  String sayHiByName(@PathVariable String course) {
        return "This course is called " + course;
    }

    //post course
}
