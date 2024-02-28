package com.example.springboot.learnjpaandhibernate.course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
  private Long id;
  private String name;
  private String author;


  @Override
  public String toString() {
    return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
  }
}
