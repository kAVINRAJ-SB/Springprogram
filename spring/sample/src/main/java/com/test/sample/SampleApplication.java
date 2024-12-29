package com.test.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		String name = "dog";
		ApplicationContext ani = new ClassPathXmlApplicationContext("abc.xml");
		Animal a = ani.getBean(name, Animal.class);
		a.behavior();
	
		System.out.println(a.getName() + " " + a.getNum());	
		
	}

}
