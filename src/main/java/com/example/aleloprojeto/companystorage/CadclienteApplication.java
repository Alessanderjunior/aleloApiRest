package com.example.aleloprojeto.companystorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
public class CadclienteApplication {

    public static void main(String[] args) {
	SpringApplication.run(CadclienteApplication.class, args);
    }

}
