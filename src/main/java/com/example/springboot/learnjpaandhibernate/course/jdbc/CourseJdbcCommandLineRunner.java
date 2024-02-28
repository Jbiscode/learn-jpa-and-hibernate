package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.learnjpaandhibernate.course.Course;

import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

  private final CourseJdbcRepository courseJdbcRepository;

  @Override
  public void run(String... args) throws Exception {
    courseJdbcRepository.insert(new Course(15l, "Microservices", "in 100 steps"));
    courseJdbcRepository.deleteById(1l);
    System.out.println(courseJdbcRepository.findById(2l));
    System.out.println(courseJdbcRepository.findById(3l));
    System.out.println(courseJdbcRepository.findById(4l));
  }
  
}
