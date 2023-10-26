package com.smartcoder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@MapperScan("com.smartcoder.mapper")
@EntityScan("com.smartcoder.entity")
@EnableJpaRepositories("com.smartcoder.repository")
public class SmartCoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCoderApplication.class, args);
	}

}
