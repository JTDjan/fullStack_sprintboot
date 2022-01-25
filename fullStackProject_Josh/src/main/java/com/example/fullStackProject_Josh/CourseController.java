package com.example.fullStackProject_Josh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@CrossOrigin(origins  =  "http://localhost:3000")
public class CourseController {
    @Autowired
            CourseRepository repository;
    ArrayList<Course> courses = new ArrayList<>();
    // 3 endpoints ( List of courses/ single course/ post to add course )

    //List of course
    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getCourses() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    // searching filters

    @GetMapping("/courses/id/{id}")
    public  ResponseEntity<Course> getCourseById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findCourseByid(Integer.parseInt(id)));
    }

    @GetMapping("/courses/{name}")
    public  ResponseEntity<Course> findCourseByName(@PathVariable String name) {

       name = name.replaceAll("_", " ");
        return ResponseEntity.status(HttpStatus.OK).body(repository.findCourseByName(name));
    }


    //posting or adding course
    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course) {
        repository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body("Course Added " + course.getName());
    }

    // delete endpoint
}
