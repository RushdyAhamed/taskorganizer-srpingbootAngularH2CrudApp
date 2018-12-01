package com.milan.taskorganizer.service;


import com.milan.taskorganizer.model.Task;
import com.milan.taskorganizer.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository tr;

    public Iterable<Task> listTasks(){
        return tr.findAll();
    }

    public Task saveTask(Task task){
        Task savedTask = tr.save(task);
        return savedTask;
    }

}

