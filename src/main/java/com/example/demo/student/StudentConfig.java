package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jeremy = new Student(
                    "Jeremy",
                    "jeremy@mail.com",
                    LocalDate.of(2000, SEPTEMBER, 2)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@mail.com",
                    LocalDate.of(1998, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(jeremy, alex)
            );
        };
    }
}
