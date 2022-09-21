package com.example.learnJPAandhibernate.course;

import com.example.learnJPAandhibernate.course.Course;
import com.example.learnJPAandhibernate.course.JPA.CourseJPARepository;
import com.example.learnJPAandhibernate.course.Jdbc.CourseJdbcRepository;
import com.example.learnJPAandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS", "Abhishek"));
        repository.save(new Course(2, "Learn Terraform", "Jain"));
        repository.save(new Course(3, "Learn Gitlab", "kamikaze"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
