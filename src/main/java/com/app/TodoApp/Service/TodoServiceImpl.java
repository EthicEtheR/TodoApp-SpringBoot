package com.app.TodoApp.Service;

import com.app.TodoApp.Models.Task;
import com.app.TodoApp.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoServiceImpl implements  TodoService{
    private final TodoRepository todoRepository;
    @Override
    public String createTask(String task) {
        log.info("Invoked createTask in service");

        todoRepository.createTask(task);

        return "";
    }

    @Override
    public Task showTask(Long id) {
        log.info("Invoked show Tasks in service ");

        return todoRepository.showTaskById(id);
    }

    @Override
    public String deleteTask(Long id) {
        log.info("Invoked deleteTask in service ");
        todoRepository.deleteTaskById(id);


        return "";
    }

    @Override
    public String toggleTask(Long id) {
        log.info("Invoked toggleTask in service ");
        todoRepository.toggleTaskById(id);

        return "";
    }

    @Override
    public List<Task> getAllTasks() {
        log.info("Invoked getAllTasks in service");

        return todoRepository.getAllTasks();
    }

    @Override
    public List<Task> showTaskList(List<Long> list) {
        log.info("Invoked showTaskList in service ");

        return todoRepository.showTaskList(list);
    }
}
