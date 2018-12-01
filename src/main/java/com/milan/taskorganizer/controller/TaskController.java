package com.milan.taskorganizer.controller;

import com.milan.taskorganizer.model.Task;
import com.milan.taskorganizer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService ts;

    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks(){
        return ts.listTasks();
    }

    @PostMapping("/save")
    public Task saveTask(Task task){
        Task savedTask =  ts.saveTask(task);
        return savedTask;
    }


}

