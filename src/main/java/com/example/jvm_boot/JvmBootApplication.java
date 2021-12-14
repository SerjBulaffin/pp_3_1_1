package com.example.jvm_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication - данная аннотация содержит в себе аннотации @Configuration, @EnableAutoConfiguration
и @ComponentScan - будет сканировать пакет и подпакеты, где находится запускной файл
 */
@SpringBootApplication
public class JvmBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmBootApplication.class, args);
	}

}
