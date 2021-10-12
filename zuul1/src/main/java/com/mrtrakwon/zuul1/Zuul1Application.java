package com.mrtrakwon.zuul1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Zuul1Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul1Application.class, args);
    }

}
