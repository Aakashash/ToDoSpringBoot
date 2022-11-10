package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
      @GetMapping("/courses")
      public List <Course> retrieve(){

        return Arrays.asList(new Course(1,"Java", "Computer Science"),
        new Course(2,"JavaScript", "Computer Science"),
        new Course(3 ,"Python", "Computer Science"));
    }
}
