package com.example.springboot.learnjpaandhibernate.course;

import com.example.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.example.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.example.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component
@Service
@Controller
@AllArgsConstructor
public class CourseCommandLineRunner implements CommandLineRunner {

  // private final CourseJdbcRepository repository;

  // private final CourseJpaRepository repository;

  private CourseSpringDataJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
    // repository.insert(new Course(7l, "점심메뉴 JPA", "in 100 steps"));
    // repository.insert(new Course(8l, "점심디저트 JPA", "in 100 steps"));
    // repository.insert(new Course(9l, "저녁메뉴 JPA", "in 100 steps"));

    repository.save(new Course(7l, "점심메뉴 JPA", "in 100 steps"));
    repository.save(new Course(8l, "점심디저트 JPA", "in 100 steps"));
    repository.save(new Course(9l, "저녁메뉴 JPA", "in 100 steps"));
    repository.deleteById(1l);
    repository.deleteById(2l);
    System.out.println(repository.findById(2l));
    System.out.println(repository.findById(3l));
    System.out.println(repository.findById(4l));
    System.out.println(repository.findById(9l));
  }
}
