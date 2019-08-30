package com.bookinggo.assignment;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
public class Rides {

    private @Id @GeneratedValue String id;
    private String pickup;
    private String dropoff;


    Rides() {
    }

    Rides(String pickup, String dropoff)
    {
        this.pickup = pickup;
        this.dropoff = dropoff;
    }
}

