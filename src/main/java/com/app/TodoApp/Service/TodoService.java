package com.app.TodoApp.Service;

public interface TodoService {
    String createTask(String task);
    String showTask(Long id);
    String deleteTask(Long id);
    String toggleTask(Long id);
}
