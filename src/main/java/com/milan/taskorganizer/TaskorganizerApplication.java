package com.milan.taskorganizer;

import com.milan.taskorganizer.model.Task;
import com.milan.taskorganizer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class TaskorganizerApplication implements CommandLineRunner {

	@Autowired
	private TaskService ts;

	public static void main(String[] args) {
		SpringApplication.run(TaskorganizerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ts.saveTask(new Task(1L, "Create first Spring boot app", LocalDate.now(), true));
		ts.saveTask(new Task(2L, "Create second Spring boot app", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(3L, "Create third Spring boot app", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(4L, "Create fourth Spring boot app", LocalDate.now().plus(5, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(5L, "Create fifth Spring boot app", LocalDate.now().plus(7, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(6L, "Create sixth Spring boot app", LocalDate.now().plus(9, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(7L, "Create seventh Spring boot app", LocalDate.now().plus(11, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(8L, "Create eighth Spring boot app", LocalDate.now().plus(13, ChronoUnit.DAYS), false));
		ts.saveTask(new Task(9L, "Create nineth Spring boot app", LocalDate.now().plus(15, ChronoUnit.DAYS), false));

	}
}
