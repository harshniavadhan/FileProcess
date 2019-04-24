package com.fileProcess.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(value = "com.fileProcess.poc")
public class FileProcessApplication {
	//this is the main class for the spring boot applicaiton.
    public static void main(String[] args) {
        SpringApplication.run(FileProcessApplication.class, args);
    }
}