package com.app.TodoApp.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
@Slf4j
public class TodoController {

    @PostMapping
    String createTask(@RequestBody String task){
        log.info("Task to be Created :{}",task);


        return"Task Created";
    }
}
