package com.shimaoxin.surprise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shimaoxin.surprise.dao.*")
public class BootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisApplication.class, args);
	}
}
