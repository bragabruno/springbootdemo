package com.example.springbootdemo;

import com.example.springbootdemo.dao.StudentRepository;
import com.example.springbootdemo.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
      return args -> {
          Student mariam = new Student(
                  "Mariam",
                  "mariam.jamal@gmail.com",
                  LocalDate.of(2000, Month.JANUARY, 5),
                  23
          );

          Student alex = new Student(
                  "Alex",
                  "alex@gmail.com",
                  LocalDate.of(2004, Month.FEBRUARY, 5),
                  20
          );

          studentRepository.saveAll(
                  List.of(mariam, alex)
          );
      };
    }
}
