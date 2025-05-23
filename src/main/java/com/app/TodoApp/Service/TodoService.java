package com.app.TodoApp.Service;

import com.app.TodoApp.Models.Task;

import java.util.List;

public interface TodoService {
    String createTask(String task);

    String deleteTask(Long id);
    String toggleTask(Long id);

    List<Task> getAllTasks();

    List<Task> showTaskList(List<Long> list);

    Task updateTask(Long id, String title);
}
