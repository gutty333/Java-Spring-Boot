package com.springBasic.controller;

import com.springBasic.entity.TodoTask;
import com.springBasic.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/task/{id}")
    public TodoTask getTask(@PathVariable int id) {
        return todoService.getTask(id);
    }

    @GetMapping("/tasks")
    public List<?> getTasks() {
        return todoService.getAllTasks();
    }

    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable int id) {
        todoService.delete(id);
    }

    @PostMapping("/task")
    public TodoTask createTask(@RequestBody TodoTask task) {
        System.out.println("Created/Updated a task successfully");
        return todoService.createOrUpdate(task);
    }
}
