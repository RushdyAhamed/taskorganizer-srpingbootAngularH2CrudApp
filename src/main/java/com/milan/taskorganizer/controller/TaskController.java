package com.milan.taskorganizer.controller;

import com.milan.taskorganizer.model.Task;
import com.milan.taskorganizer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")

public class TaskController {

    @Autowired
    private TaskService ts;

    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks(){
        return ts.listTasks();
    }

    @PostMapping(value = "/save")
    public Task saveTask(@RequestBody Task task){
        Task savedTask =  ts.saveTask(task);
        return savedTask;
    }

    @PutMapping(value = "/update")
    public Task updateTask(@RequestBody Task task){
        Task updatedTask =  ts.saveTask(task);
        return updatedTask;
    }


}

