package com.scaler.taskmanagerspring.tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<TaskEntity, Long> {
    //Spring Boot will automatically use Simple JPA Repository when the interface is extending the JPA Repository
}
