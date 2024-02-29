package com.example.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

  @Id
  private Long id;

  private String name;

  private String author;

  @Override
  public String toString() {
    return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
  }
}
