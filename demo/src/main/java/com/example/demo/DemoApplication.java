package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public DemoApplication() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside DemoApplication - Constructor");
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(DemoApplication.class, args);
		
		Student s = app.getBean(Student.class);
		s.show();
		
		//The above one is just a show method.
	}

}
