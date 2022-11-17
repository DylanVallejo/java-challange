package com.ltp.painting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PaintingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaintingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("da vinci art work");
		
	}

}

