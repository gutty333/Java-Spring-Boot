package com.springBasic.controller;

import com.springBasic.entity.TodoTask;
import com.springBasic.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @Operation(summary = "Get a target task")
    @GetMapping("/task/{id}")
    public TodoTask getTask(@PathVariable int id) {
        return todoService.getTask(id);
    }

    @Operation(summary = "Get all tasks")
    @GetMapping("/tasks")
    public List<?> getTasks() {
        return todoService.getAllTasks();
    }

    @Operation(summary = "Delete a target task")
    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable int id) {
        todoService.delete(id);
    }

    @Operation(summary = "Create/Update a task")
    @PostMapping("/task")
    public TodoTask createTask(@RequestBody TodoTask task) {
        System.out.println("Created/Updated a task successfully..");
        return todoService.createOrUpdate(task);
    }
}
