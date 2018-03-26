package com.ubertas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.ubertas.controller", "com.ubertas.service", "com.ubertas.spring"})
@EntityScan({"com.ubertas.domain"})
@EnableJpaRepositories("com.ubertas.repository")
public class UbertasApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbertasApplication.class, args);
    }
}
