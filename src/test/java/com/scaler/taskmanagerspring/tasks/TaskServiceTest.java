package com.scaler.taskmanagerspring.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@DataJpaTest
public class TaskServiceTest {
    @Autowired TasksRepository tasksRepository;

    @Test
    public void testCreateTasks(){
        TasksService tasksService = new TasksService(tasksRepository);
        TaskEntity task = tasksService.createTask("Test Task", "Test Description", new Date());
        System.out.println(task);
    }
}
