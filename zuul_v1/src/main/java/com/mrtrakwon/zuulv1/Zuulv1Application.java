package com.mrtrakwon.zuulv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class Zuulv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Zuulv1Application.class, args);
	}
}
