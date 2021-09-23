package com.kasun.tasksapp.controller;

import com.kasun.tasksapp.domain.Task;
import com.kasun.tasksapp.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
