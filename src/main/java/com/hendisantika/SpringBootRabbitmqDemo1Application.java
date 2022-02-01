package com.hendisantika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootRabbitmqDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqDemo1Application.class, args);
    }

}
