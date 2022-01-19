package com.example.fullStackProject_Josh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    Course findCourseByid(int id);
    Course findCourseByName(String name);
    String deleteCourseByid(int id);
}
