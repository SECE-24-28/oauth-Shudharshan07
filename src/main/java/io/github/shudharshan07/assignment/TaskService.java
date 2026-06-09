package io.github.shudharshan07.assignment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    List<Task> data = new ArrayList<>();

    public Task addTask(Task task) {
        data.add(task);

        return task;
    }

    public Task getTask(int id) {
        return data.get(id);
    }

    public Task deletetask(int id) {
        return data.remove(id);
    }
}

