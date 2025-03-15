package com.springBasic.service;

import com.springBasic.entity.TodoTask;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level= AccessLevel.PRIVATE)
public class TodoService {
    static HashMap<Integer, TodoTask> todoTaskStore = new HashMap<>();

    public TodoTask createOrUpdate(TodoTask todoTask) {
        return todoTaskStore.put(todoTask.getId(), todoTask);
    }

    public TodoTask getTask(int id) {
        return todoTaskStore.get(id);
    }

    public void delete(int id) {
        todoTaskStore.remove(id);
    }

    public List<TodoTask> getAllTasks() {
        return todoTaskStore.values().stream().toList();
    }
}
