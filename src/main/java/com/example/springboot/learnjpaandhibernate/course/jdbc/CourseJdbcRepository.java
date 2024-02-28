package com.example.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springboot.learnjpaandhibernate.course.Course;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CourseJdbcRepository {
  private final JdbcTemplate jdbcTemplate;
  private static String INSERT_QUERY = """
    INSERT INTO course (id, name, author) 
    VALUES (?, ?, ?)
    """;
    private static String DELETE_QUERY = """
      DELETE FROM course
      WHERE id = ?
      """;


  public void insert(Course course) {
    jdbcTemplate.update(INSERT_QUERY,course.getId(), course.getName(), course.getAuthor());
  }

  public void deleteById(Long id) {
    jdbcTemplate.update(DELETE_QUERY, id);
  }

  public Course findById(Long id) {
    return jdbcTemplate.queryForObject("SELECT * FROM course WHERE id = ?", new BeanPropertyRowMapper<>(Course.class), id);
  }
}
