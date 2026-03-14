package com.klu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student student() {
        Student s = new Student(102, "Geethika", "BTech CSE", 2);
        s.setCourse("Computer Science");
        s.setYear(2);
        return s;
    }
}