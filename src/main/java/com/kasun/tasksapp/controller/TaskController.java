package com.kasun.tasksapp.controller;

import com.kasun.tasksapp.domain.Task;
import com.kasun.tasksapp.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * *@author KasunBalasooriya
 * *@date 2021-09-23 6:16 PM
 */

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }
    
    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
