package com.chenc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenc.demo.dao.mapper")
public class Mybatis01Application {

	public static void main(String[] args) {
		SpringApplication.run(Mybatis01Application.class, args);
	}

}
