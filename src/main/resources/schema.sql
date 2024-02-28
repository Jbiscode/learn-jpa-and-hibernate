-- Active: 1709087298072@@127.0.0.1@3306@test
DROP TABLE IF EXISTS course;
CREATE TABLE course(
  id BIGINT not null,
  name VARCHAR(255) not null,
  author VARCHAR(255) not null,
  PRIMARY KEY (id)
);
