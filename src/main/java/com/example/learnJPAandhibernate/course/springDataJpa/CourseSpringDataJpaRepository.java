package com.example.learnJPAandhibernate.course.springDataJpa;

import com.example.learnJPAandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
