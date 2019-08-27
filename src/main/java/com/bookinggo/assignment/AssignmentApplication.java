package com.bookinggo.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
public class AssignmentApplication {

    private static final Logger log = LoggerFactory.getLogger(AssignmentApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class);//, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            ApiResponse apiResponse = restTemplate.getForObject(
                    "https://techtest.rideways.com/", ApiResponse.class);
            log.info(apiResponse.toString());
        };
    }

}



