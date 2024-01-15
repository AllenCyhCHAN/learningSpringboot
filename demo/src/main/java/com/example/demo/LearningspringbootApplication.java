package com.example.demo;

import com.example.demo.Student.Student;
import com.example.demo.Student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LearningspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningspringbootApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//		return args -> {
//			studentRepository.save(new Student(
//					"Maria",
//					"yhchanbd@connect.ust.hk",
//					21
//			));
//		};
//	}

}
