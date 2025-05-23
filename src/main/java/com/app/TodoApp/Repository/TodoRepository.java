package com.app.TodoApp.Repository;

import com.app.TodoApp.Models.Task;

import java.util.List;

public interface TodoRepository {
    void createTask(String task);

    List<Task> getAllTasks();
}
