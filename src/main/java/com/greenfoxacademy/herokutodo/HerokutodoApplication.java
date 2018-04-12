package com.greenfoxacademy.herokutodo;

import com.greenfoxacademy.herokutodo.Model.ToDo;
import com.greenfoxacademy.herokutodo.Model.ToDoService;
import com.greenfoxacademy.herokutodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HerokutodoApplication implements CommandLineRunner {
	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HerokutodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}