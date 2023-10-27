package com.buildtmwlearning.springbootapipojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.buildtmwlearning.springbootapipojo")
public class SpringbootapipojoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootapipojoApplication.class, args);

    }

}
