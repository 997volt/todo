package com.volt.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@GetMapping("/greet")
	public GreetResponse greet(){
		return new GreetResponse(
				"Hello",
				List.of(5.0,3.5,2.2),
				new Person("Alex", 10));
	}

	record Person(String name, int age){}


	record GreetResponse(
			String greet,
			List<Double> scores,
			Person person) {}
}