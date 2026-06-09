package io.github.shudharshan07.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {

    @Autowired
    TaskService service;

    ArrayList<Task> data = new ArrayList<>();
    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTask(@PathVariable int id) {

        return ResponseEntity.ok(service.getTask(id));
    }


    @PostMapping("/task")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        return ResponseEntity.ok(service.addTask(task));
    }

    @DeleteMapping("/task/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable int id) {
        return ResponseEntity.ok(service.deletetask(id));
    }

}
