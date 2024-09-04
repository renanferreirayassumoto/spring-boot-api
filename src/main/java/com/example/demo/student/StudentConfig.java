package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student renan = new Student("Renan", LocalDate.of(2004, 7, 16), "renan@gmail.com");

            Student henrique = new Student("Henrique", LocalDate.of(2000, 5, 9), "henrique@gmail.com");

            repository.saveAll(List.of(renan, henrique));
        };

    }
}
