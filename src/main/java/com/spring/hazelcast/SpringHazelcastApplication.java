package com.spring.hazelcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHazelcastApplication.class, args);
	}

}
