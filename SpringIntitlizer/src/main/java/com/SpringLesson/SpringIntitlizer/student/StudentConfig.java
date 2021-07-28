package com.SpringLesson.SpringIntitlizer.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args ->{
             Student mariam = new Student(
                    "mariam",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "jeh@fmam.com");
            Student Alex = new Student(
                    "Alex",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "jehlexy@fmam.com");
            studentRepository.saveAll(List.of(mariam,Alex));
        };
    }
}
