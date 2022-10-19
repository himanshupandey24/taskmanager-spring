package com.scaler.taskmanagerspring.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


//Using Lombok, at the compilation time it will generate these methods
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private Boolean isCompleted;
    private Date dueDate;

}
