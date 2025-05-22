package com.app.TodoApp.Repository;

import com.app.TodoApp.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
