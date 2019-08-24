package com.bookinggo.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {

    public static void main(String[] args) {
        System.out.println("args: " + args[0]);
        SpringApplication.run(AssignmentApplication.class, args);

    }

}
