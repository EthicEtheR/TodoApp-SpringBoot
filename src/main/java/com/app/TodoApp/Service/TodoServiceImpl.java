package com.app.TodoApp.Service;

import com.app.TodoApp.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
    public String showTask(Long id) {
        return "";
    }

    @Override
    public String deleteTask(Long id) {
        return "";
    }

    @Override
    public String toggleTask(Long id) {
        return "";
    }
}
