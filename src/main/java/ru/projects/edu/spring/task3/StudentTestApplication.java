package ru.projects.edu.spring.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.projects.edu.spring.task3.config.AppLauncher;

import java.io.IOException;

@SpringBootApplication
public class StudentTestApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(StudentTestApplication.class, args);
		AppLauncher launcher = context.getBean(AppLauncher.class);
		launcher.start();
	}

}
