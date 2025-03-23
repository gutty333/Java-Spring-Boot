package com.springBasic.service;

import com.springBasic.entity.TodoTask;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class TodoService {
    TodoTaskRepository todoTaskRepository;

    public TodoTask createOrUpdate(TodoTask todoTask) {
        return todoTaskRepository.save(todoTask);
    }

    public TodoTask getTask(int id) {
        return todoTaskRepository.findById(id);
    }

    public void delete(int id) {
        todoTaskRepository.deleteById(id);
    }

    public List<TodoTask> getAllTasks() {
        return todoTaskRepository.findAll();
    }
}
