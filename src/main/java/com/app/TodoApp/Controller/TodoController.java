package com.app.TodoApp.Controller;

import com.app.TodoApp.Models.Task;
import com.app.TodoApp.Service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@Slf4j
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    String createTask(@RequestBody String task){
        log.info("Task to be Created :{}",task);
        todoService.createTask(task);

        return"Task Created";
    }
    @GetMapping
    public List<Task> getAllTasks(){
        log.info("Invoked getAllTask in controller ");
        return todoService.getAllTasks();
    }



    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        log.info("Invoked toggleTask in controller using id :{}",id);
        todoService.toggleTask(id);
        return "Done";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        log.info("Invoked deleteTask in controller using id :{}",id);
        todoService.deleteTask(id);
        return "Successfully deleted ";
    }
    @GetMapping("/byList")
    public List<Task> showTaskList(@RequestBody List<Long> list){
        log.info("Invoked showTaskList in controller using List of id :{}",list);

        return  todoService.showTaskList(list);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id,@RequestBody String title){
        log.info("Invoked updateTask in controller with id :{} and updated title :{}",id, title);
        return todoService.updateTask(id,title);
    }


}
