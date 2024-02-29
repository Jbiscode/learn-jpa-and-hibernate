package com.example.springboot.learnjpaandhibernate.course.jpa;

import com.example.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Transactional
public class CourseJpaRepository {

  private final EntityManager entityManager;

  public void insert(Course course) {
    entityManager.merge(course);
  }

  public Course findById(Long id) {
    return entityManager.find(Course.class, id);
  }

  public void deleteById(Long id) {
    Course course = findById(id);
    entityManager.remove(course);
  }
}
