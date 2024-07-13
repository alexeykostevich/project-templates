package com.alexeykostevich.springmvcapp.web.controllers;

import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexeykostevich.springmvcapp.domain.CourseService;
import com.alexeykostevich.springmvcapp.web.models.CourseResponse;

@RestController
@RequestMapping("/api")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = Objects.requireNonNull(courseService);
    }

    @GetMapping("/courses")
    public List<CourseResponse> allCourses() {
        return courseService.getAllCourses()
                .stream()
                .map(x -> new CourseResponse(x.id(), x.title()))
                .toList();
    }
}
