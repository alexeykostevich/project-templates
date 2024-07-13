package com.alexeykostevich.springmvcapp.persistence;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alexeykostevich.springmvcapp.domain.Course;
import com.alexeykostevich.springmvcapp.domain.CourseService;

@Service
public class DefaultCourseService implements CourseService {

    @Override
    public List<Course> getAllCourses() {
        return List.of(
                new Course(1, "Spring Boot"),
                new Course(2, "Splunk"),
                new Course(4, "AWS")
        );
    }
}
