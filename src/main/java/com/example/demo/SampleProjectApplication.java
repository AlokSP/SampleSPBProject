package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
		/*SpringApplication app=new SpringApplication(SampleProjectApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args); */
		System.out.println("Hello World");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		
	}

}
