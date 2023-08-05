package com.spring_angular.spring_angular_online_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringAngularOnlineTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularOnlineTestApplication.class, args);
	}

}
