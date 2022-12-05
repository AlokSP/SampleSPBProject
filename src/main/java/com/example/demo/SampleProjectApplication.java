package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SampleProjectApplication implements CommandLineRunner {
	
	@Value("${num.a}")
	private Integer a;
	
	@Value("${num.b}")
	private Integer b;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ProjectInfo projectInfo;
	
	
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
		System.out.println("Using Value Annotation " + "a= "+a +" b= "+b);
		System.out.println("Using Environment Class  and getProperty method " + "a= "+env.getProperty("num.a") +" b= "+env.getProperty("num.b"));
		System.out.println("Using ConfigurationProperties Annotation " + "a= "+projectInfo.getA() +" b= "+projectInfo.getB());
		
		
		
	}

}
