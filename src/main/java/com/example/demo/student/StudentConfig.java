package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student s1 = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1988, 4, 21)
            );

            Student s2 = new Student(
                    "Alex",
                    "alex@op.com",
                    LocalDate.of(2001, 6, 11)
            );

            repository.saveAll(
                    List.of(s1, s2)
            );
        };
    }
}
