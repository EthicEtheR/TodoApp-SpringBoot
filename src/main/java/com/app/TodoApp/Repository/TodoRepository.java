package com.app.TodoApp.Repository;

import com.app.TodoApp.Models.Task;

import java.util.List;

public interface TodoRepository {
    void createTask(String task);

    List<Task> getAllTasks();



    void toggleTaskById(Long id);

    void deleteTaskById(Long id);

    List<Task> showTaskList(List<Long> list);

    Task updateTask(Long id, String title);
}
