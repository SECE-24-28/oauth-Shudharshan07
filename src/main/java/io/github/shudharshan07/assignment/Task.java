package io.github.shudharshan07.assignment;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "Title is mandatory")
    @Size(min = 2, max = 50, message = "Task must be between 2 and 50 characters")
    String title;

    @Column(name = "task")
    @NotBlank(message = "Task is mandatory")
    @Size(min = 2, max = 50, message = "Task must be between 2 and 50 characters")
    String task;
    LocalTime created_time;
    LocalTime updated_time;

    public Task(String title, String task, LocalTime created_time) {
        this.title = title;
        this.task = task;
        this.created_time = created_time;
    }
}
