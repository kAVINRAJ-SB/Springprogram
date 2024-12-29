package com.test.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
		String c="apple";
		ApplicationContext fru = new ClassPathXmlApplicationContext("demo.xml");
		 Fruit f = fru.getBean(c, Fruit.class);
		 f.Color();
         
			
		
	}


}
