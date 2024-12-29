package com.example.demo1;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("welcome");
		Scanner scan = new Scanner(System.in);
		String type1 = scan.nextLine(); 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Vehicle c = context.getBean(type1, Vehicle.class);
		c.engineType();
	}

}
