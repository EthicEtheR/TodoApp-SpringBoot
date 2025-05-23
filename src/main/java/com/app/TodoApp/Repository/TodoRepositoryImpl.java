package com.app.TodoApp.Repository;

import com.app.TodoApp.Models.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
@RequiredArgsConstructor
public class TodoRepositoryImpl implements TodoRepository{
    private final TaskRepository taskRepository;
    @Override
    public void createTask(String task) {
        log.info("Going to create Task in DB ");
        Task task1=new Task();
        task1.setTitle(task);
        task1.setCompleted(false);

        taskRepository.save(task1);


    }

    @Override
    public List<Task> getAllTasks() {
        log.info("Getting all task from DB");
        
       return  taskRepository.findAll();

    }
}
