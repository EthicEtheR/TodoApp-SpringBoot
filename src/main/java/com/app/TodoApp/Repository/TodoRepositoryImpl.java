package com.app.TodoApp.Repository;

import com.app.TodoApp.Exception.ResourceNotFoundException;
import com.app.TodoApp.Models.Task;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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

    @Override
    public Task showTaskById(Long id) {
        log.info("Getting a Task by its Id from DB");
      return taskRepository.findById(id).get();

    }

    @Override
    public void toggleTaskById(Long id) {
        log.info("Going to toggle the task by its Id in DB");
        Task task=taskRepository.findById(id).get();

        if(task.isCompleted())
             task.setCompleted(false);
        else
            task.setCompleted(true);

        taskRepository.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        log.info("Going to delete Task from DB using its Id");
        taskRepository.deleteById(id);
//        if (taskRepository.existsById(id)) {
//            taskRepository.deleteById(id);
//        } else {
//            throw new ResourceNotFoundException("Task with id " + id + " not found");
//        }


    }

    @Override
    public List<Task> showTaskList(List<Long> list) {
        log.info("Going to show all task according list");
        List<Task> tasks=new ArrayList<>();
        for(long i :list){
            tasks.add(taskRepository.findById(i).get());
        }
        return tasks;
    }
}
