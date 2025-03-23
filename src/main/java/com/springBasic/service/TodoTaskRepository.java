package com.springBasic.service;

import com.springBasic.entity.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoTaskRepository extends JpaRepository<TodoTask, Integer> {
    TodoTask findById(int id);
    void deleteById(int id);
    TodoTask save(TodoTask todoTask);
    List<TodoTask> findAll();
}
