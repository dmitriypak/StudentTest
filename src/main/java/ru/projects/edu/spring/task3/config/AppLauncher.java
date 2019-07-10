package ru.projects.edu.spring.task3.config;

import org.springframework.stereotype.Service;
import ru.projects.edu.spring.task3.dao.TestDao;
import ru.projects.edu.spring.task3.service.resourceload.TestLoader;
import ru.projects.edu.spring.task3.service.student.StudentService;
import ru.projects.edu.spring.task3.service.testing.TestService;

import java.io.IOException;

@Service
public class AppLauncher {
  private final TestLoader testLoader;
  private final StudentService studentService;
  private final TestService testService;
  private final TestDao testDao;

  public AppLauncher(TestLoader testLoader, TestService testService, StudentService studentService, TestDao testDao) {
    this.testLoader = testLoader;
    this.testService = testService;
    this.studentService = studentService;
    this.testDao = testDao;
  }

  public void start() throws IOException {
    if (studentService.registerStudent() && testLoader.loadTest()) {
      testService.start(testDao.getTest());
    }
  }
}
